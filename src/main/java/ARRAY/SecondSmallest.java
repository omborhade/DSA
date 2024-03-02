package ARRAY;

public class SecondSmallest {

    public  static int Findsmallest(int arr[]){
        int min= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min= arr[i];
            }
        }
        return  min;
    }
    public  static  int FindSecondSmallest(int arr[]){
        int Firstsmallest= Findsmallest(arr);
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==Firstsmallest){
                arr[i]=Integer.MAX_VALUE;
            }

        }
        int SecondSmalllest= Findsmallest(arr);
        return  SecondSmalllest;
    }
    public static void main(String[] args) {
        int arr[]={ 33,5,55,22,87,4,};
        System.out.println(FindSecondSmallest(arr));
    }
}
