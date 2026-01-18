import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        int a=0;
        int b=1;
        System.out.println("Fabonacci Number till N ");
        for (int i = 0; i < num; i++) {
            System.out.println(a);
            int c =a+b; 
            a=b;
            b=c;

        }
        
        sc.close();
    }
}
