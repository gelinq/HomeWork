import java.util.Arrays;
import java.util.Random;

// TODO: 29.02.2020 Объявить и заполнить массивы
//  для каждого примитивного типа в отдельном методе.
//  Вернуть ссылку на массив в Main.
//  Отсортировать и скопировать в другой массив.
//  Вывести на экран
//  Примитивы: byte, short, int, long, float, double, boolean, char

public class Array {
    public static void main(String[] args) {

        int n = 10;
        Random random = new Random();

        System.out.println("Массив byte");
        byte[] byteArray = getRandomByteArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(byteArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(byteArray);
        System.out.println(Arrays.toString(byteArray));
        System.out.println("___________________________");

        System.out.println("Массив short");
        short[] shortArray = getRandomShortArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(shortArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(shortArray);
        System.out.println(Arrays.toString(shortArray));
        System.out.println("___________________________");

        System.out.println("Массив int");
        int[] intArray = getRandomIntArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(intArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println("___________________________");

        System.out.println("Массив long");
        long[] longArray = getRandomLongArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(longArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(longArray);
        System.out.println(Arrays.toString(longArray));
        System.out.println("___________________________");

        System.out.println("Массив float");
        float[] floatArray = getRandomFloatArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(floatArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(floatArray);
        System.out.println(Arrays.toString(floatArray));
        System.out.println("___________________________");

        System.out.println("Массив double");
        double[] doubleArray = getRandomDoubleArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(doubleArray);
        System.out.println(Arrays.toString(doubleArray));
        System.out.println("___________________________");

        System.out.println("Массив boolean");
        boolean[] booleanArray = getRandomBooleanArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(booleanArray));
        System.out.println("Отсортированный массив:");
        //Arrays.sort(booleanArray);
        booleanArray = sortBoolean(n,booleanArray);
        System.out.println(Arrays.toString(booleanArray));
        System.out.println("___________________________");

        System.out.println("Массив char");
        char[] charArray = getRandomCharArray(n, random);
        System.out.println("Массив заполненный рандомно:");
        System.out.println(Arrays.toString(charArray));
        System.out.println("Отсортированный массив:");
        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));
        System.out.println("___________________________");

    }

    private static boolean[] getRandomBooleanArray(int n, Random random) {
        boolean[] help = new boolean[n];
        for (int i = 1; i < n; i++) {
            help[i] = random.nextBoolean();
        }
        return help;
    }

    private static double[] getRandomDoubleArray(int n, Random random) {
        double[] help = new double[n];
        for (int i = 1; i < n; i++) {
            help[i] = random.nextDouble();
        }
        return help;
    }

    private static float[] getRandomFloatArray(int n, Random random) {
        float[] help = new float[n];
        for (int i = 1; i < n; i++) {
            help[i] = (float) random.nextFloat();
        }
        return help;
    }

    private static long[] getRandomLongArray(int n, Random random) {
        long[] help = new long[n];
        for (int i = 1; i < n; i++) {
            help[i] = random.nextLong();
        }
        return help;
    }

    private static short[] getRandomShortArray(int n, Random random) {
        short[] help = new short[n];
        for (int i = 1; i < n; i++) {
            help[i] = (short) random.nextInt();
        }
        return help;
    }

    private static byte[] getRandomByteArray(int n, Random random) {
        byte[] help = new byte[n];
        for (int i = 0; i < n; i++) {
            help[i] = (byte) random.nextInt();
        }
        return help;
    }

    public static int[] getRandomIntArray(int n, Random random) {
        int[] help = new int[n];
        for (int i = 0; i < n; i++) {
            help[i] = random.nextInt();
        }
        return help;
    }

    public static char[] getRandomCharArray(int n, Random random) {
        char[] help = new char[n];
        for (int i = 0; i < n; i++) {
            help[i] = (char) random.nextInt();
        }
        return help;
    }

    private static boolean[] sortBoolean(int n, boolean[] a) {
        for (int i = 0; i < n; i++) {
            for (int k = i + 1; k < n; k++) {
                if (a[i] && !a[k]) {
                    a[i] = false;
                    a[k] = true;
                }
            }
        }
        return a;
    }

}
