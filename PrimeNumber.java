import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            int inp = sc.nextInt();

            int count = 0;

            for (int div = 1; div <= inp; div++) {
                if (inp % div == 0) {
                    count++;

                    // break;
                }
            }

            if (count == 2) {
                System.out.println("Prime");
            } else {
                System.out.println("Not Prime");
            }
        }

        sc.close();
    }
}
