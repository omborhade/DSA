package ARRAY;

public class prefixsum {



    public  static  int[] PrefixSUM(int arr[]){
        int n = arr.length;


        for (int i = 1; i <n ; i++) {
             arr[i]= arr[i-1]+ arr[i];
        }
        return  arr;
    }

    public static void main(String[] args) {
    //    System.out.println("start");
        int arr[]={2,3,4,2};

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        PrefixSUM(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }




    }

}
