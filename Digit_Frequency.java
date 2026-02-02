import java.util.Scanner;

public class Digit_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] arr = new int[10];
        while (num > 0) {
            int digit = num % 10;
            arr[digit]++;
            num /= 10;
        }
        System.out.println("Digit frequencies:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("Digit " + i + ": " + arr[i] + " time(s)");
            }
        }
        sc.close();
    }
}
