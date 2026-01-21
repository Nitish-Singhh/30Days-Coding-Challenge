import java.util.Scanner;

public class PalidromeCheckArray {
    public static boolean isPalindrome(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        if (isPalindrome(arr)) {
            System.out.println("This array is a palindrome.");
        } else {
            System.out.println("This array is not a palindrome.");
        }
        sc.close();
    }

}
