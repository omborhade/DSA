package ARRAY;

public class SecondLargest {


    public static  int maxNo(int arr[]){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]> max){
                max=arr[i];
            }
        }
        return max;
    }
      public static  int FindSecondMax(int arr[]){
        int max= maxNo(arr);
          for (int i = 0; i < arr.length; i++) {
              if(arr[i]==max){
                  arr[i]=Integer.MIN_VALUE;
              }
          }

         int SecondMx=  maxNo(arr);
         return  SecondMx;

      }
    public static void main(String[] args) {
        int arr[]= {1,4,9,5,2,8,44,88,};

        System.out.println(FindSecondMax(arr));
    }
}
