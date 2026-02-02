import java.util.Scanner;

public class Decimal_TO_AnyBase {

    public static int convertintoBase(int decimalNumber, int base) {
        int result = 0;
        int power = 1;

        while (decimalNumber > 0) {
            int remainder = decimalNumber % base;
            result += remainder * power;
            decimalNumber = decimalNumber/ base;
            power *= 10;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimalNumber = sc.nextInt();
        System.out.print("Enter the base to convert : ");
        int base = sc.nextInt();
        int decNum = convertintoBase(decimalNumber, base);
        System.out.println("The number " + decimalNumber + " in base " + base + " is: " + decNum);
        sc.close();
    }
}