import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int value = n;
        for (int i = 1; i <= 10; i++) {
            System.out.println(value +" x "+ i + " =  " + (value * i));
        }
        sc.close();
    }
}
