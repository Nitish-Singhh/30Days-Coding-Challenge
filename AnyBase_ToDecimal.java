import java.util.Scanner;

public class AnyBase_ToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in any base: ");
        int anyBaseNumber = sc.nextInt();
        System.out.print("Enter the base of the number: ");
        int base = sc.nextInt();
        int decimalNumber = 0;
        int power = 1;
        while (anyBaseNumber > 0) {
            int remainder = anyBaseNumber % 10;
            decimalNumber += remainder * power;
            anyBaseNumber = anyBaseNumber / 10;
            power *= base;
        }
        System.out.println("The decimal equivalent is: " + decimalNumber);
        sc.close();
    }
}
