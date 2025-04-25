import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a searching algorithm to perform");
        System.out.println("1. Linear Search");
        System.out.println("2. Binary Search");
        System.out.println("3. Jump Search");
        System.out.println("4. Exponential Search");

        System.out.println("Enter your choice(1-4): ");
        int choice = sc.nextInt();
        int[] elements;
        int target;

        switch (choice) {
            case 1:
                elements = elements(sc);
                target = GetTarget(sc);
                linearsearch.LinearSearch(elements, target);
                break;

            case 2:
                elements = elements(sc);
                bubbleSort(elements);
                printArray(elements);
                target = GetTarget(sc);
                binarySearch.binarySearch(elements, target);
                break;

        }

    }

    public static int[] elements(Scanner sc) {
        System.out.println("Enter a elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enterr the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int GetTarget(Scanner sc) {

        System.out.println("Enter a target number: ");
        return sc.nextInt();

    }

    public static void bubbleSort(int[] num) {
        int n = num.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {

                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;

                }
            }
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
