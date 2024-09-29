import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = keyboard.nextInt();
        int[] a = new int[n];
        System.out.print("Enter the numbers in the array: ");
        for (int i = 0; i < n; ++i) {
            a[i] = keyboard.nextInt();
        }

        Arrays.sort(a);
        System.out.println("Array after sorting is: " + Arrays.toString(a));

        int sum = 0;
        for (int num : a) {
            sum += num;
        }
        double average = (double) sum / n;
        System.out.println("Sum of the array numbers is: " + sum);
        System.out.println("Average of the array number is: " + average);
    }
}
