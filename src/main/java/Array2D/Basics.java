package Array2D;

import java.util.Scanner;

public class Basics {

    public static int searchMax(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }

            }}
        return max;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int matrix[][] = new int[3][3];


            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            System.out.println();
            //print the practice

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println(searchMax(matrix));
        }
    }

