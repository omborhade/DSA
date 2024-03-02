package ARRAY;

public class SortArray0sand1s {

    public static void sort0and1( int[] A) {

        // Write your Code here
          int n = A.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            if (A[start] == 1 && A[end] == 0) {
                int temp = A[start];
                A[start] = A[end];
                A[end] = temp;
                start++;
                end--;
            }
            if (A[start] == 0) {
                start++;
            }
            if (A[end] == 1) {
                end--;
            }
        }
    }

        public static void main(String[] args) {
        int A[]={1,0,1,0,1,0,0,1};
        sort0and1(A);
            for (int i = 0; i < A.length; i++) {
                System.out.print(A[i]);

            }
    }
}
