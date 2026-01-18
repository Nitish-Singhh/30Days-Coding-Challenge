import java.util.Scanner;

public class InerseRightAngleTrangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int n = sc.nextInt();
        int space = n - 1;
        int str = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
            space--;
            str++;
            System.out.println();
        }
        sc.close();
    }
}
