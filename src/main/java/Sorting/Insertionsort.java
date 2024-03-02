package Sorting;

public class Insertionsort {

    public  static void insertionsort(int arr[]){
        for (int i = 1; i <arr.length ; i++) {
            int last = arr[i];
            int swapindex = i-1;
            while(swapindex>=0  && arr[swapindex]> last){
                swapindex--;
            }
            for (int j = i; j >=swapindex+2 ; j--) {
                arr[j]=arr[j-1];
            }
            arr[swapindex+1]=last;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,7,8,2,9};
        insertionsort(arr);
        for(int a :arr){
            System.out.print(a+" ");
        }
    }
}
