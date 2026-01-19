import java.util.Scanner;

public class ReverseDiagonal_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (i + j == num + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();

        }
        sc.close();
    }
}
