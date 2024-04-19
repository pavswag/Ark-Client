package com.client.sign;

import java.applet.Applet;
import java.io.*;
import java.net.*;

import com.client.Buffer;
import com.client.Configuration;
import com.client.js5.disk.ArchiveDisk;
import com.google.common.base.Preconditions;
import net.runelite.client.RuneLite;

public final class Signlink implements Runnable {


	public static BufferedFile cacheData = null;

	public static BufferedFile[] cacheIndexes;

	public static ArchiveDisk masterDisk;

	public static BufferedFile cacheMasterIndex = null;


	public static String indexLocation(int cacheIndex, int index) {
		return Signlink.getCacheDirectory() + "index" + cacheIndex + "/"
				+ (index != -1 ? index + ".gz" : "");
	}


	public static void startpriv(InetAddress inetaddress) {
		threadliveid = (int) (Math.random() * 99999999D);
		if (active) {
			try {
				Thread.sleep(500L);
			} catch (Exception _ex) {
			}
			active = false;
		}
		socketreq = 0;
		threadreq = null;
		dnsreq = null;
		savereq = null;
		urlreq = null;
		socketip = inetaddress;
		Thread thread = new Thread(new Signlink());
		thread.setDaemon(true);
		thread.start();
		while (!active)
			try {
				Thread.sleep(50L);
			} catch (Exception _ex) {
			}
	}
	
	public static void createCacheDirectory() {
		File file = new File(getCacheDirectory());
		if (!file.exists()) {
			Preconditions.checkState(file.mkdir());
		}
	}

	@Override
	public void run() {
		active = true;
		String s = getCacheDirectory();
		uuid = getuid(s);
		try {
			cache_dat = new RandomAccessFile(s + "main_file_cache.dat", "rw");
			for (int j = 0; j < 5; j++)
				cache_idx[j] = new RandomAccessFile(s + "main_file_cache.idx" + j, "rw");

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		for (int i = threadliveid; threadliveid == i;) {
			if (socketreq != 0) {
				try {
					socket = new Socket(socketip, socketreq);
				} catch (Exception _ex) {
					socket = null;
				}
				socketreq = 0;
			} else if (threadreq != null) {
				Thread thread = new Thread(threadreq);
				thread.setDaemon(true);
				thread.start();
				thread.setPriority(threadreqpri);
				threadreq = null;
			} else if (dnsreq != null) {
				try {
					dns = InetAddress.getByName(dnsreq).getHostName();
				} catch (Exception _ex) {
					dns = "unknown";
				}
				dnsreq = null;
			} else if (savereq != null) {
				if (savebuf != null)
					try (FileOutputStream fileoutputstream = new FileOutputStream(s + savereq)) {
						fileoutputstream.write(savebuf, 0, savelen);
					} catch (IOException e) {
						e.printStackTrace();
					}
				if (waveplay) {
					waveplay = false;
				}
				if (midiplay) {
					midi = s + savereq;
					midiplay = false;
				}
				savereq = null;
			} else if (urlreq != null) {
				try {
					System.out.println("urlstream");
					urlstream = new DataInputStream((new URL(
							mainapp.getCodeBase(), urlreq)).openStream());
				} catch (Exception _ex) {
					urlstream = null;
				}
				urlreq = null;
			}
			try {
				Thread.sleep(50L);
			} catch (Exception _ex) {
			}
		}

	}

	public static void hasPermissions(File cacheDir) {
		FileSystem.cacheDir = cacheDir;
		if (!cacheDir.exists()) {
			throw new RuntimeException("Cache directory does not have Permission : " + cacheDir.getAbsolutePath());
		}
		FileSystem.hasPermissions = true;
	}
	/**
	 * Returns the File object for the given file name, creating it if it doesn't exist.
	 *
	 * @param fileName the name of the file
	 * @return the File object for the given file name
	 * @throws RuntimeException if the file system permissions are not set or the file cannot be created
	 */
	public static File getFile(String fileName) {
		if (!FileSystem.hasPermissions) {
			throw new RuntimeException("File system permissions are not set");
		}

		File file = (File) FileSystem.cacheFiles.get(fileName);

		if (file != null) {
			return file;
		} else {
			File newFile = new File(FileSystem.cacheDir, fileName);

			try {
				File parentDir = newFile.getParentFile();

				if (!parentDir.exists()) {
					throw new RuntimeException("Parent directory does not exist");
				}

				RandomAccessFile raf = new RandomAccessFile(newFile, "rw");
				int firstByte = raf.read();
				raf.seek(0L);
				raf.write(firstByte);
				raf.seek(0L);
				raf.close();

				FileSystem.cacheFiles.put(fileName, newFile);

				return newFile;
			} catch (IOException e) {
				throw new RuntimeException("Failed to create file: " + e.getMessage());
			}
		}
	}

	public static String operatingSystemName;
	public static String formattedOperatingSystemName;
	public static String userHomeDirectory = "";
	public static String[] cacheParentPaths;
	public static String[] cacheSubPaths;
	public static File cacheDir;
	public static void init(int archiveCount) throws Exception {
		try {
			operatingSystemName = System.getProperty("os.name");
		} catch (Exception var14) {
			operatingSystemName = "Unknown";
		}

		formattedOperatingSystemName = operatingSystemName.toLowerCase();

		try {
			userHomeDirectory = System.getProperty("user.home");
			if (userHomeDirectory != null) {
				userHomeDirectory = userHomeDirectory + "/";
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		try {
			if (formattedOperatingSystemName.startsWith("win")) {
				if (userHomeDirectory == null) {
					userHomeDirectory = System.getenv("USERPROFILE");
				}
			} else if (userHomeDirectory == null) {
				userHomeDirectory = System.getenv("HOME");
			}

			if (userHomeDirectory != null) {
				userHomeDirectory = userHomeDirectory + "/";
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		if (userHomeDirectory == null) {
			userHomeDirectory = "~/";
		}

		cacheParentPaths = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", userHomeDirectory, "/tmp/", ""};
		cacheSubPaths = new String[]{"."  + Configuration.CLIENT_TITLE + "_cache_" + 209, ".file_store_" + 209};

		label135:
		for(int var8 = 0; var8 < 4; ++var8) {
			cacheDir = getCachedFile("LIVE", "", var8);
			if (!cacheDir.exists()) {
				cacheDir.mkdirs();
			}

			File[] cacheFiles = cacheDir.listFiles();
			if (cacheFiles == null) {
				break;
			}

			int fileIndex = 0;

			while(true) {
				if (fileIndex >= cacheFiles.length) {
					break label135;
				}

				File var7 = cacheFiles[fileIndex];
				if (!overwriteFileWithFirstByte(var7, false)) {
					break;
				}

				++fileIndex;
			}
		}

		hasPermissions(cacheDir);
		generateUID();

		cacheData = new BufferedFile(new AccessFile(getFile("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		cacheMasterIndex = new BufferedFile(new AccessFile(getFile("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		cacheIndexes = new BufferedFile[archiveCount];

		for(int currentArchive = 0; currentArchive < archiveCount; ++currentArchive) {
			cacheIndexes[currentArchive] = new BufferedFile(new AccessFile(getFile("main_file_cache.idx" + currentArchive), "rw", 1048576L), 6000, 0);
		}
	}

	public static boolean overwriteFileWithFirstByte(File file, boolean deleteOriginal) {
		try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
			int firstByte = raf.read();
			raf.seek(0L);
			raf.write(firstByte);
		} catch (IOException e) {
			return false;
		}
		if (deleteOriginal) {
			return file.delete();
		}
		return true;
	}

	public static BufferedFile uid = null;
	public static void generateUID() {
		try {
			File uidFile = null;
			for (String subPath : cacheSubPaths) {
				for (String parentPath : cacheParentPaths) {
					File uidFileTemp = new File(parentPath + subPath + File.separatorChar + "random.dat");
					if (uidFileTemp.exists()) {
						uidFile = uidFileTemp;
					}
				}
			}
			if (uidFile == null) {
				uidFile = createUIDFile();
			}
			uid = new BufferedFile(new AccessFile(uidFile, "rw", 25L), 24, 0);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static File createUIDFile() throws IOException {
		File uidFile = new File(userHomeDirectory, "random.dat");
		RandomAccessFile raf = new RandomAccessFile(uidFile, "rw");
		int firstByte = raf.read();
		raf.seek(0L);
		raf.write(firstByte);
		raf.seek(0L);
		raf.close();
		return uidFile;
	}

	public static File getCachedFile(String cacheType, String cacheKey, int cacheVersion) {
		String versionSuffix = cacheVersion == 0 ? "" : String.valueOf(cacheVersion);
		File locationFile = new File(userHomeDirectory, Configuration.CLIENT_TITLE.toLowerCase() + "_cl_" + cacheType + "_" + cacheKey + versionSuffix + ".dat");
		String filePath = null;
		String backupFilePath = null;
		boolean isFileLocationFound = false;

		if (locationFile.exists()) {
			try {
				AccessFile file = new AccessFile(locationFile, "rw", 10000L);
				Buffer buffer = new Buffer((int) file.length());
				int read;
				while ((read = file.read(buffer.payload, buffer.pos, buffer.payload.length - buffer.pos)) != -1) {
					buffer.pos += read;
					if (buffer.pos == buffer.payload.length) {
						break;
					}
				}
				buffer.pos = 0;
				int version = buffer.readUnsignedByte();

				if (version < 1 || version > 3) {
					throw new IOException("Unsupported version " + version);
				}

				int extraFile = 0;
				if (version > 1) {
					extraFile = buffer.readUnsignedByte();
				}

				if (version <= 2) {
					filePath = buffer.readString();
					if (extraFile == 1) {
						backupFilePath = buffer.readString();
					}
				} else {
					filePath = buffer.readCESU8();
					if (extraFile == 1) {
						backupFilePath = buffer.readCESU8();
					}
				}

				file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			if (filePath != null) {
				File file = new File(filePath);
				if (!file.exists()) {
					filePath = null;
				}
			}

			if (filePath != null) {
				File file = new File(filePath, "test.dat");
				if (!overwriteFileWithFirstByte(file, true)) {
					filePath = null;
				}
			}
		}

		if (filePath == null && cacheVersion == 0) {
			for (String subPath : cacheSubPaths) {
				for (String parentPath : cacheParentPaths) {
					File file = new File(parentPath + subPath + File.separatorChar + cacheType + File.separatorChar);
					if (file.exists() && overwriteFileWithFirstByte(new File(file, "test.dat"), true)) {
						filePath = file.toString();
						isFileLocationFound = true;
						break;
					}
				}
			}
		}

		if (filePath == null) {
			filePath = RuneLite.CACHE_DIR + versionSuffix + File.separatorChar + cacheType + File.separatorChar + cacheKey + File.separatorChar;
			isFileLocationFound = true;
		}

		if (backupFilePath != null) {
			File backupFile = new File(backupFilePath);
			File backupLocation = new File(filePath);

			try {
				File[] files = backupFile.listFiles();
				if (files != null) {
					for (File srcFile : files) {
						File destFile = new File(backupLocation, srcFile.getName());
						boolean isRenamed = srcFile.renameTo(destFile);
						if (!isRenamed) {
							throw new IOException("Failed to rename file from " + srcFile.getPath() + " to " + destFile.getPath());
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			isFileLocationFound = true;
		}

		if (isFileLocationFound) {
			writeToFile(locationFile,new File(filePath), (File)null);
		}

		return new File(filePath);
	}


	public static void writeToFile(File locationFile,File file1, File file2) {
		try {
			AccessFile accessFile = new AccessFile(locationFile, "rw", 10000L);
			Buffer buffer = new Buffer(500);
			buffer.writeByte(3);
			buffer.writeByte(file2 != null ? 1 : 0);
			buffer.writeCESU8(file1.getPath());
			if (file2 != null) {
				buffer.writeCESU8("");
			}
			accessFile.write(buffer.payload, 0, buffer.pos);
			accessFile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static final String separator = System.getProperty("file.separator");
	private static final String devCache = "." + separator + Configuration.DEV_CACHE_NAME + separator;
	private static Boolean devCacheEnabled = false;



	public static boolean usingDevCache() {
		return devCacheEnabled;
	}

	public static final String getCacheDirectory() {

		// Dev cache only loads in dev mode to allow for easy switching.
		if (new File(devCache).exists()) {
			if (Configuration.developerMode) {
				devCacheEnabled = true;
				return devCache;
			}

			System.out.println("Development cache detected but client was not launched in developer mode (-d run argument).");
		}

		return RuneLite.CACHE_DIR.getAbsolutePath() + "/";
	}

	public static String findcachedirORIG() {
		String as[] = { "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/",
				"e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/",
				"~/", "/tmp/", "", "c:/rscache", "/rscache" };
		if (storeid < 32 || storeid > 34)
			storeid = 32;
		String s = ".file_store_" + storeid;
		for (int i = 0; i < as.length; i++)
			try {
				String s1 = as[i];
				if (s1.length() > 0) {
					File file = new File(s1);
					if (!file.exists())
						continue;
				}
				File file1 = new File(s1 + s);
				if (file1.exists() || file1.mkdir())
					return s1 + s + "/";
			} catch (Exception _ex) {
			}

		return null;

	}

	public static int getuid(String s) {
		try {
			File file = new File(s + "uid.dat");
			if (!file.exists() || file.length() < 4L) {
				try(DataOutputStream dataoutputstream = new DataOutputStream(new FileOutputStream(s + "uid.dat"))) {
					dataoutputstream.writeInt((int) (Math.random() * 99999999D));
				}
			}
		} catch (Exception _ex) {
			_ex.printStackTrace();
		}
		try (DataInputStream datainputstream = new DataInputStream(new FileInputStream(s + "uid.dat"))) {
			int i = datainputstream.readInt();
			return i + 1;
		} catch (Exception _ex) {
			return 0;
		}
	}

	public static synchronized Socket opensocket(int i) throws IOException {
		for (socketreq = i; socketreq != 0;)
			try {
				Thread.sleep(50L);
			} catch (Exception _ex) {
			}

		if (socket == null)
			throw new IOException("could not open socket");
		else
			return socket;
	}

	public static synchronized DataInputStream openurl(String s)
			throws IOException {
		for (urlreq = s; urlreq != null;)
			try {
				Thread.sleep(50L);
			} catch (Exception _ex) {
			}

		if (urlstream == null)
			throw new IOException("could not open: " + s);
		else
			return urlstream;
	}

	public static synchronized void dnslookup(String s) {
		dns = s;
		dnsreq = s;
	}

	public static synchronized void startthread(Runnable runnable, int i) {
		threadreqpri = i;
		threadreq = runnable;
	}

	public static synchronized boolean wavesave(byte abyte0[], int i) {
		if (i > 0x1e8480)
			return false;
		if (savereq != null) {
			return false;
		} else {
			wavepos = (wavepos + 1) % 5;
			savelen = i;
			savebuf = abyte0;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		}
	}

	public static synchronized boolean wavereplay() {
		if (savereq != null) {
			return false;
		} else {
			savebuf = null;
			waveplay = true;
			savereq = "sound" + wavepos + ".wav";
			return true;
		}
	}

	public static synchronized void midisave(byte abyte0[], int i) {
		if (i > 0x1e8480)
			return;
		if (savereq != null) {
		} else {
			midipos = (midipos + 1) % 5;
			savelen = i;
			savebuf = abyte0;
			midiplay = true;
			savereq = "jingle" + midipos + ".mid";
		}
	}

	public static void reporterror(String s) {
		System.err.println("reporterror: " + s);
	}

	public Signlink() {
	}

	public static final int clientversion = 317;
	public static int uuid;
	public static int storeid = 32;
	public static RandomAccessFile cache_dat = null;
	public static final RandomAccessFile[] cache_idx = new RandomAccessFile[5];
	public static boolean sunjava;
	public static Applet mainapp = null;
	public static boolean active;
	public static int threadliveid;
	public static InetAddress socketip;
	public static int socketreq;
	public static Socket socket = null;
	public static int threadreqpri = 1;
	public static Runnable threadreq = null;
	public static String dnsreq = null;
	public static String dns = null;
	public static String urlreq = null;
	public static DataInputStream urlstream = null;
	public static int savelen;
	public static String savereq = null;
	public static byte[] savebuf = null;
	public static boolean midiplay;
	public static int midipos;
	public static String midi = null;
	public static int midivol;
	public static int midifade;
	public static boolean waveplay;
	public static int wavepos;
	public static int wavevol;
	public static boolean reporterror = true;
	public static String errorname = "";

}
