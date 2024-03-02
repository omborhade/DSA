package ARRAY;

import java.util.Scanner;

public class MaxUnsorted {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        getMax(arr,k);
    }
    static void getMax(int[] arr, int k){
        int max = arr[0];
        int count = 0;
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > max) {
                    max = j;
                }
            }
            count++;
            if(count==k){
                System.out.println(max);
            }
            max = 0;

        }
    }
}
