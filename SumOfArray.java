import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of elements in the array: ");
        System.out.print("Enter the Size of an Array here : ");
        int size = sc.nextInt();
        System.out.print("Enter the Elements now : ");
        int arr[] = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println("The Sum of an Array is : " + sum);
        sc.close();
    }
}
