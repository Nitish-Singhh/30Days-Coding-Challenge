import java.util.Scanner;

public class MoveZeroAtEnd_Array {
    public static void moveZeroesToEnd(int[] arr) {
        int nonZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZero] = arr[i];
                nonZero++;
            }
        }
        while (nonZero < arr.length) {
            arr[nonZero] = 0;
            nonZero++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroesToEnd(arr);
        System.out.println("Array after moving zeroes to the end:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
