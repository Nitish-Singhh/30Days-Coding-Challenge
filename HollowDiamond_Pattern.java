import java.util.Scanner;

public class HollowDiamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int num = sc.nextInt();
        int str = num / 2 + 1;
        int space = 1;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }

            if (i <= num / 2) {
                str--;
                space = space + 2;
            } else {
                str++;
                space = space - 2;
            }
            System.out.println();
        }
        sc.close();
    }
}
