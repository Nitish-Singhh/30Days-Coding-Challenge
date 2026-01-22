import java.util.Scanner;

public class SixtyDegreeHollowTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int j = 1; j < (2 * i - 2); j++) {
                    System.out.print(" ");
                }

                System.out.print("* ");
            }

            System.out.println();
        }

        for (int i = 1; i <= (n-1)+1; i++) {
            System.out.print("* ");
        }
        sc.close();
    }
}
