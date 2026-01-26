import java.util.Scanner;

public class LinearSearching_Recursion {

    
    public static int LinearSearchHelper(int arr[], int Elem, int index) {
        if (index == arr.length) {
            System.out.println("Element Not Found in the Array");
            return -1;
        }
        if (arr[index] == Elem) {
            System.out.println("Element Found at Index : " + index);
            return index;
        }
        return LinearSearchHelper(arr, Elem, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array :");
        int size = sc.nextInt();
        System.out.println("Now, Enter the Elements in the Array : ");
        int arr[] = new int[size];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the Element you Want to Search in the Array  ");
        int Elem = sc.nextInt();
        int index = 0;
        LinearSearchHelper(arr, Elem,index);

        sc.close();
    }
}
