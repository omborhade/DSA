package ARRAY;

public class LastNoInSortedPosition {

    public static  void  lastnoinsortedpositin(int arr[]){
        int last = arr[arr.length-1];
        int swapindex = arr.length-2;

        while (swapindex >= 0 && arr[swapindex]>last) {
           swapindex--;
        }

        for (int i = arr.length-1; i >=swapindex+2 ; i--) {
            arr[i]=arr[i-1];

        }
        arr[swapindex+1]=last;
    }


    public static void main(String[] args) {
        int arr[]={2,5,6,8,9,4};
         lastnoinsortedpositin(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }

    }
}
