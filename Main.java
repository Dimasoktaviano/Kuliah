import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int[] arr = new int[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("");
            System.out.println(
                    "1. Random Data\n2. Simulasi Bubble Sort - Ascending\n3. Simulasi Selection Sort - Ascending\n4. Simulasi Bubble Sort - Descending\n5. Simulasi Selection Sort - Descending\n6. Keluar");
            System.out.println("");
            System.out.print("Pilih opsi: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    randomData();
                    break;
                case 2:
                    bubbleSortAsc();
                    break;
                case 3:
                    selectionSortAsc();
                    break;
                case 4:
                    bubbleSortDesc();
                    break;
                case 5:
                    selectionSortDesc();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
            }
        }
    }

    public static void randomData() {
        System.out.print("Masukkan batas bawah:");
        int lower = scanner.nextInt();
        System.out.print("Masukkan batas atas:");
        int upper = scanner.nextInt();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(upper - lower) + lower;
        }
        System.out.println("Data: " + Arrays.toString(arr));
    }

    public static void bubbleSortAsc() {
        int[] copy = arr.clone();
        System.out.println("\nPass 1");

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length - i - 1; j++) {
                if (copy[j] > copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(copy));
        }

        System.out.println(" \nResult Pass 1");
        System.out.println(Arrays.toString(copy));

    }

    public static void selectionSortAsc() {
        int[] copy = arr.clone();
        System.out.println("\nPass 2");

        for (int i = 0; i < copy.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[j] < copy[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = copy[minIdx];
            copy[minIdx] = copy[i];
            copy[i] = temp;
            System.out.println(Arrays.toString(copy));
        }

        System.out.println(" \nResult Pass 2");
        System.out.println(Arrays.toString(copy));
    }

    public static void bubbleSortDesc() {
        int[] copy = arr.clone();
        System.out.println("\nPass 3");

        for (int i = 0; i < copy.length; i++) {
            for (int j = 0; j < copy.length - i - 1; j++) {
                if (copy[j] < copy[j + 1]) {
                    int temp = copy[j];
                    copy[j] = copy[j + 1];
                    copy[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(copy));
        }

        System.out.println(" \nResult Pass 3");
        System.out.println(Arrays.toString(copy));
    }

    public static void selectionSortDesc() {
        System.out.println("\nPass 4");

        int[] copy = arr.clone();
        for (int i = 0; i < copy.length; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < copy.length; j++) {
                if (copy[j] > copy[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = copy[maxIdx];
            copy[maxIdx] = copy[i];
            copy[i] = temp;
            System.out.println(Arrays.toString(copy));
        }

        System.out.println(" \nResult Pass 4");
        System.out.println(Arrays.toString(copy));
    }
}