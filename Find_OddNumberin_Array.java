import java.util.Scanner;

public class Find_OddNumberin_Array {

    public static void findOddEven(int arr[]) {
        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                System.out.println("0 is neither odd nor even");
            } else if (arr[i] % 2 == 0) {
                System.out.println(arr[i] + " is Even Number");
                countEven++;
            } else {
                System.out.println(arr[i] + " is Odd Number");
                countOdd++;
            }
        }
        System.out.println("______________________________________________");
        System.out.println("\nTotal Even Numbers : " + countEven);
        System.out.println("______________________________________________");

        System.out.println("Total Odd Numbers  : " + countOdd);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Size of an Array : ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter the Elements in an Array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("______________________________________________");

        findOddEven(arr);

        sc.close();
    }
}
