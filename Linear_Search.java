import java.util.Scanner;

public class Linear_Search {
    public static int LinearSearching(int arr[], int Elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Elem) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int len = arr.length;
        System.out.print("Enter the Elements in an Array ");
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Elements you Want to Search in the Array ");
        int Elem = sc.nextInt();
        int idx = LinearSearching(arr, Elem);
        if (idx == -1) {
            System.out.println("Elements not Found in the Array ");
        }

        else {
            System.out.println("Element " + Elem + " is Found at the index " + idx);
        }

        sc.close();
    }
}
