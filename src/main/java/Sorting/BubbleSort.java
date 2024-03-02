package Sorting;

public class BubbleSort {
      public static void bubblesort(int arr[]){
          for (int i = 0; i <arr.length-1 ; i++)//for turns
          {
              for (int j = 0; j <arr.length-1-i ; j++) {

                  if(arr[j]>arr[j+1]){
                      int temp =arr[j];
                      arr[j]=arr[j+1];
                      arr[j+1]=temp;
                  }

              }

          }
      }
      public static void printarr(int arr[]){
          for (int i = 0; i <arr.length ; i++) {
              System.out.print(arr[i]+" ");

          }
      }
    public static void main(String[] args) {
        int arr[]={3,7,8,4,2,9};
        bubblesort(arr);
        printarr(arr);
    }
}
