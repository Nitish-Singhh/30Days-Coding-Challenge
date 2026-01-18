import java.util.Scanner;

public class ReverseOfA_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int num = sc.nextInt();
        // int digit = 0;
        System.out.print("The Reverse of a Number is : ");
        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            System.out.print(digit);

        }
        sc.close();
    }
}
