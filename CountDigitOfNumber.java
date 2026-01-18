import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = 0;
        int n = sc.nextInt();
        while (n != 0) {
            n = n / 10;
            num++;
        }
        System.out.println("Total Digit in the Given Number is : " + num);
        sc.close();
    }
}
