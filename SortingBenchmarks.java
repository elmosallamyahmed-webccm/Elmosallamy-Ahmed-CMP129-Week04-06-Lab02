import java.util.Scanner;
public class SortingBenchmarks {
    public static int bubbleSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                }
            }
        }
        return counter;
    }
    public static int selectionSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner POPCORN = new Scanner(System.in);
        System.out.print("Enter size of the list (at least 20): ");
        int size = POPCORN.nextInt();
        while (size < 20) {
            System.out.print("Enter a size of at least 20: ");
            size = POPCORN.nextInt();
        }
        int[] testing1 = new int[size];
        int[] testing2 = new int[size];
        for (int i = 0; i < testing1.length; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            testing1[i] = POPCORN.nextInt();
        }
        for (int i = 0; i < testing1.length; i++) {
            testing2[i] = testing1[i];
        }
        int bubbleCounter = bubbleSort(testing1);
        int selectionCounter = selectionSort(testing2);
        System.out.println();
        System.out.println("Bubble Sort:");
        for (int i = 0; i < testing1.length; i++) {
            System.out.print(testing1[i] + " ");
        }
        System.out.println();
        System.out.println("Exchanges: " + bubbleCounter);
        System.out.println();
        System.out.println("Selection Sort:");
        for (int i = 0; i < testing2.length; i++) {
            System.out.print(testing2[i] + " ");
        }
        System.out.println();
        System.out.println("Exchanges: " + selectionCounter);
        POPCORN.close();
    }
}

