import java.util.Scanner;

public class BinarySearching {
    public static int Binary_Searching(int arr[], int elem) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] < elem) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
            // System.out.println("Element Not Found");

        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array ");
        int size = sc.nextInt();
        System.out.println("Now, Enter the Elements in an array ");
        int arr[] = new int[size];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Elements you Want to Search in the Array : ");
        int elem = sc.nextInt();

        int result = Binary_Searching(arr, elem);

        if (result == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element Found at index " + result);
        }
        sc.close();
    }
}
