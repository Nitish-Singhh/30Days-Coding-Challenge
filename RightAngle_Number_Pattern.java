import java.util.Scanner;

public class RightAngle_Number_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int size = sc.nextInt();
        int n = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
        sc.close();
    }
}
