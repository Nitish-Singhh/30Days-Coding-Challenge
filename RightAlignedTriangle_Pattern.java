import java.util.Scanner;

public class RightAlignedTriangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int n = sc.nextInt();
        int space = 0;
        int str = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
            space++;
            str--;
            System.out.println();
        }
        sc.close();
    }
}
