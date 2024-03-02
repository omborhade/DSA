package ARRAY;

public class RotateEleInLeft {

    public static  void rev(int arr[], int start , int end){
        while (start<end){
          int temp =   arr[start];
          arr[ start]= arr[ end];
          arr[end]= temp;
          start++;
          end--;
        }
    }
    public static  void rotateleft(int arr[], int k) {
         int n = arr.length;
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }

    public  static  void rotateright(int arr[], int k){
        int n = arr.length;
        rev(arr,0,n-k-1);
        rev(arr,n-k,n-1);
        rev(arr, 0,n-1);
    }


    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
     //   rotateleft(arr,2);
        rotateright(arr,3);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
