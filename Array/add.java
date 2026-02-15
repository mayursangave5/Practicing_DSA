package Array;
import java.util.*;

public class add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);   // 🔥 IMPORTANT

        System.out.println("for matrix 1:");
        System.out.println("enter no of rows:");
        int n = sc.nextInt();

        System.out.println("enter no of columns:");
        int c = sc.nextInt();

        System.out.println("enter elements:");

        int arr[][] = new int[n][c];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("for matrix 2:");
        System.out.println("enter elements:");

        int arr2[][] = new int[n][c];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // Print Matrix 1
        System.out.println("Matrix 1:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Print Matrix 2
        System.out.println("Matrix 2:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        // Matrix Addition
        int arr3[][] = new int[n][c];

        System.out.println("Matrix Addition:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c; j++) {
                arr3[i][j] = arr[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
