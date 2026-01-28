import java.util.Scanner;

public class Remove_DuplicatesFromSorted_Array {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int idx = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter the elements of the sorted array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        int newLength = removeDuplicates(nums);
        System.out.println("The length of the array after removing duplicates is: " + newLength);
        System.out.println("The array after removing duplicates is:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}
