import java.util.Scanner;

public class DiamondShape_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int num = sc.nextInt();
        int space = num / 2;
        int str = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= str; j++) {
                System.out.print("*\t");
            }
            if (i <= num / 2) {
                space--;
                str = str + 2;
            } else {
                space++;
                str = str -2;
            }
            System.out.println();
        }
        sc.close();

    }
}
