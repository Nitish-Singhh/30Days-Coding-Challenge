import java.util.Scanner;

public class PrintAtoZ {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a Number here : ");
            int num = sc.nextInt();

            if (num < 65) {
                throw new IllegalArgumentException("Number must be 65 or greater to print alphabets");
            }

            System.out.println("Printing Alphabets : ");
            for (int i = 65; i <= num; i++) {
                char alpha = (char) i;
                System.out.print(alpha + " ");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            sc.close();
        }

    }
}
