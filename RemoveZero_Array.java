import java.util.Scanner;

public class RemoveZero_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array after removing zeroes:");
        for (int i = 0; i < size; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }

        sc.close();
        }
    }
}
