import java.util.Scanner;

public class Matrices {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = keyboard.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = keyboard.nextInt();

        int[][] m1 = new int[r][c];
        int[][] m2 = new int[r][c];
        int[][] m = new int[r][c];

        System.out.println("Enter the first matrix: ");
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                m1[i][j] = keyboard.nextInt();
            }
        }
        System.out.println("Enter the second matix: ");
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                m2[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("The result is: ");
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
