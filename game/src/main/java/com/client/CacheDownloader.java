package com.client;

import com.client.sign.Signlink;
import com.google.common.base.Preconditions;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveException;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.ArchiveStreamFactory;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZFile;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

public class CacheDownloader {

	private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(CacheDownloader.class.getName());

	public static int cacheVersionRemote;
	public static int cacheVersionLocal;

	private Client client;

	private static final int BUFFER = 1024;

	private Path fileLocation;

	public CacheDownloader(Client client) {
		Objects.requireNonNull(Signlink.getCacheDirectory());
		this.client = client;
		fileLocation = Paths.get(Signlink.getCacheDirectory(), getArchivedName());
	}

	private int getLocalVersion() {
		try(BufferedReader fr = new BufferedReader(new FileReader(Signlink.getCacheDirectory() + File.separator + "version.dat"))){
			return Integer.parseInt(fr.readLine());
		} catch (Exception e) {
			return -1;
		}
	}

//	private int getRemoteVersion() {
//		try {
//			URL versionUrl = new URL(Configuration.VERSION_URL);
//			try(Scanner scanner = new Scanner(versionUrl.openStream())) {
//				return scanner.nextInt();
//			}
//		} catch (Exception e) {
//			return 0;
//		}
//	}

	public void writeVersion(int version) {
		File versionFile = new File(Signlink.getCacheDirectory() + File.separator + "version.dat");
		if(versionFile.exists())
			versionFile.delete();
		try(BufferedWriter br = new BufferedWriter(new FileWriter(versionFile))) {
			br.write(version + "");
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void deleteZip() {
		try {
			Files.deleteIfExists(fileLocation);
		} catch (IOException ex) {
			log.severe("Cannot delete cache zip file.");
		}
	}

	public CacheDownloader downloadCache() {
		if (Signlink.usingDevCache()) {
			System.out.println("Using local_cache, skipping cache update.");
			return null;
		}

		try {
			File location = new File(Signlink.getCacheDirectory());
			File version = new File(Signlink.getCacheDirectory() + "/version.dat");
			cacheVersionRemote = Configuration.CACHE_VERSION;
			if (!location.exists() || !version.exists()) {
				log.info("Cache does not exist, downloading.");
				update();
			} else {
				cacheVersionLocal = getLocalVersion();
				log.info("Cache version local=" + cacheVersionLocal + ", remote=" + cacheVersionRemote);
				if (cacheVersionRemote != cacheVersionLocal) {
					update();
				} else {
					return null;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//ClientWindow.popupMessage("Could not download the cache file.",
					//"The website might be down or experiencing interruptions.",
					//Signlink.getCacheDirectory());
		} catch (Exception e) {
			e.printStackTrace();
			//ClientWindow.popupMessage("An error occurred while installing the cache.",
					//"You may experience crashes or gameplay interruptions.",
					//"Try deleting the cache and restarting the client.",
					//Signlink.getCacheDirectory());
		}
		return null;
	}

	private void update() throws IOException {
		downloadFile(Configuration.
				CACHE_LINK, getArchivedName());
	}

	private void downloadFile(String adress, String localFileName) throws IOException {
/*		OutputStream out = null;
		URLConnection conn;
		InputStream in = null;

		try {
			URL url = new URL(adress);
			out = new BufferedOutputStream(new FileOutputStream(Signlink.getCacheDirectory() + "/" + localFileName));

			conn = url.openConnection();
			in = conn.getInputStream();

			byte[] data = new byte[BUFFER];

			int numRead;
			long numWritten = 0;
			int fileSize = conn.getContentLength();
			long startTime = System.currentTimeMillis();

			while ((numRead = in.read(data)) != -1) {
				out.write(data, 0, numRead);
				numWritten += numRead;

				int percentage = (int) (((double) numWritten / (double) fileSize) * 100D);
				long elapsedTime = System.currentTimeMillis() - startTime;
				int downloadSpeed = (int) ((numWritten / 1024) / (1 + (elapsedTime / 1000)));

				float speedInBytes = 1000f * numWritten / elapsedTime;
				int timeRemaining =  (int) ((fileSize - numWritten) / speedInBytes);

				client.drawLoadingText(percentage, Configuration.CLIENT_TITLE + " - Downloading Cache " + percentage + "%");
			}
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
				unZip();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}*/
	}

	private String getArchivedName() {
		int lastSlashIndex = Configuration.CACHE_LINK.lastIndexOf('/');
		if (lastSlashIndex >= 0 && lastSlashIndex < Configuration.CACHE_LINK.length() - 1) {
			String u = Configuration.CACHE_LINK.substring(lastSlashIndex + 1);
			return u.replace("?dl=1", "");
		} else {
			System.err.println("error retrieving archived name.");
		}
		return "";
	}

	public void unZip() throws IOException {
/*		try (SevenZFile sevenZFile = new SevenZFile(new File(fileLocation.toString()))) {

			SevenZArchiveEntry entry;
			int numWritten = 0;
			int files = countRegularFiles(new File(fileLocation.toString()));

			while ((entry = sevenZFile.getNextEntry()) != null) {
				String fileName = entry.getName();
				File newFile = new File(Signlink.getCacheDirectory() + File.separator + fileName);

				if (entry.isDirectory()) {
					new File(Signlink.getCacheDirectory() + entry.getName()).mkdir();
				} else {
					int percentage = (int) (((double) numWritten++ / (double) files) * 100D);
					client.drawLoadingText(percentage, Configuration.CLIENT_TITLE + " - Installing Cache " + percentage + "%");

					if (fileName.equals(fileLocation.getFileName().toString())) {
						try {
							unzip(sevenZFile, fileLocation.toString());
						} catch (IOException e) {
							e.printStackTrace();
							// Handle the IO exception (log, show error message, etc.)
						}
						break;
					}

					File file = new File(newFile.getParent());
					if (!file.exists()) {
						Preconditions.checkState(file.mkdirs(), "Cannot create file.");
					}

					try {
						unzip(sevenZFile, Signlink.getCacheDirectory() + fileName);
					} catch (IOException e) {
						e.printStackTrace();
						// Handle the IO exception (log, show error message, etc.)
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			// Handle other IO exceptions (log, show error message, etc.)
		} finally {
			deleteZip();

			writeVersion(cacheVersionRemote);
		}*/
	}

	private void unzip(SevenZFile sevenZFile, String outputFilePath) throws IOException {
		try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(outputFilePath))) {
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = sevenZFile.read(buffer)) != -1) {
				out.write(buffer, 0, bytesRead);
			}
		}
	}
	private static int countRegularFiles(File sevenZFile) throws IOException {
		int count = 0;

		File tempFile = File.createTempFile("tempSevenZFile", ".7z");
		try {
			// Create a temporary file to copy the content of the original SevenZFile
			Files.copy(sevenZFile.toPath(), tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

			// Create a new SevenZFile instance for counting
			try (SevenZFile tempSevenZFile = new SevenZFile(tempFile)) {
				SevenZArchiveEntry entry;
				while ((entry = tempSevenZFile.getNextEntry()) != null) {
					if (!entry.isDirectory()) {
						count++;
					}
				}
			}
		} finally {
			// Cleanup: delete the temporary file
			tempFile.delete();
		}

		return count;
	}




}