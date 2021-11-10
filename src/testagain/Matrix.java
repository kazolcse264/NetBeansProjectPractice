package testagain;

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int SumOfDiagonalElements = 0;
        int SumOfUpperTriangleElements = 0;
        int SumOfLowerTriangleElements = 0;

        System.out.print("Enter no of rows : ");
        int row = input.nextInt();
        System.out.print("Enter no of columns : ");
        int column = input.nextInt();

        int[][] A = new int[row][column];
        int[][] B = new int[row][column];
        int[][] SumOfMatrix = new int[row][column];

        System.out.println("Enter the elements of Matrix A : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                A[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of Matrix B : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                B[i][j] = input.nextInt();
            }
        }

        System.out.println("Elements of Matrix A : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + A[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Elements of Matrix B : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(" " + B[i][j]);
            }
            System.out.println("");
        }

        System.out.println("Sum of the two matrix : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                SumOfMatrix[i][j] = A[i][j] + B[i][j];
                System.out.print(" " + SumOfMatrix[i][j]);
            }
            System.out.println("");
        }

        if (row == column) {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (i == j) {
                        SumOfDiagonalElements = SumOfDiagonalElements + SumOfMatrix[i][j];
                    }
                    if (i < j) {
                        SumOfUpperTriangleElements = SumOfUpperTriangleElements + SumOfMatrix[i][j];
                    }
                    if (i > j) {
                        SumOfLowerTriangleElements = SumOfLowerTriangleElements + SumOfMatrix[i][j];
                    }
                }
            }
            System.out.println("Sum of Diagonal matrix : " + SumOfDiagonalElements);
            System.out.println("Sum of Upper Triangle matrix : " + SumOfUpperTriangleElements);
            System.out.println("Sum of Lower Triangle matrix : " + SumOfLowerTriangleElements);
        } else {
            System.out.println("Number of rows and Columns must be Same.");
        }

    }
}
