package com.client;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static com.client.particle.ParticleDefinition.RANDOM;

public class Utility {
    public static <T> void rotateLeftByOne(List<T> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        T firstElement = list.remove(0);
        list.add(firstElement);
    }
    public static int[] d2Tod1(int[][] array) {
        int[] newArray = new int[array.length*array[0].length];

        for (int i = 0; i < array.length; ++i)
            for (int j = 0; j < array[i].length; ++j) {
                newArray[i*array[0].length+j] = array[i][j];
            }

        return newArray;
    }

    public static int[][] d1Tod2(int[] array, int width) {
        int[][] newArray = new int[array.length/width][width];

        for (int i = 0; i < array.length; ++i) {
            newArray[i/width][i%width] = array[i];
        }

        return newArray;
    }
    public static String getDate() {
        return new SimpleDateFormat("EE MMM dd yyyy").format(new Date());
    }

    public static <T> T randomElement(T[] array) {
        return array[(int) (RANDOM.nextDouble() * array.length)];
    }

    public static int randomElement(int[] array) {
        return array[(int) (RANDOM.nextDouble() * array.length)];
    }

    public static String formatName(final String name) {
        if (name.length() > 0) {
            char first = name.charAt(0);
            StringBuilder fixed = new StringBuilder("" + Character.toUpperCase(first));
            for (int index = 1; index < name.length(); index++) {
                char character = name.charAt(index);
                if (character == '_' || character == ' ') {
                    character = ' ';
                    fixed.append(character);
                    if (index + 1 < name.length() && name.charAt(index + 1) >= 'a' && name.charAt(index + 1) <= 'z') {
                        fixed.append(Character.toUpperCase(name.charAt(index + 1)));
                        index++;
                    }
                } else {
                    fixed.append(character);
                }
            }
            return fixed.toString();
        } else {
            return name;
        }
    }

    public static String getRank(int rank) {
        switch (rank) {
            case 0:
                return "Moderator";
            case 1:
                return "Administrator";
            case 2:
                return "Staff Manager";
            case 15:
                return "Developer";
        }
        return "Player";
    }

    public static void IterableNodeDeque_addBefore(Node var0, Node var1) {
        if (var0.next != null) {
            var0.remove();
        }

        var0.next = var1;
        var0.previous = var1.previous;
        var0.next.previous = var0;
        var0.previous.next = var0;
    }

    public static String intToString(int var0, boolean var1) {
        return var1 && var0 >= 0 ? method7088(var0, 10, var1) : Integer.toString(var0);
    }

    static String method7088(int var0, int var1, boolean var2) {
        if (var1 >= 2 && var1 <= 36) {
            if (var2 && var0 >= 0) {
                int var3 = 2;

                for (int var4 = var0 / var1; var4 != 0; ++var3) {
                    var4 /= var1;
                }

                char[] var5 = new char[var3];
                var5[0] = '+';

                for (int var6 = var3 - 1; var6 > 0; --var6) {
                    int var7 = var0;
                    var0 /= var1;
                    int var8 = var7 - var0 * var1;
                    if (var8 >= 10) {
                        var5[var6] = (char)(var8 + 87);
                    } else {
                        var5[var6] = (char)(var8 + 48);
                    }
                }

                return new String(var5);
            } else {
                return Integer.toString(var0, var1);
            }
        } else {
            throw new IllegalArgumentException("" + var1);
        }
    }
}
