import java.util.Scanner;

public class RightAngle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number here : ");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();
        sc.close();
    }
    
}
