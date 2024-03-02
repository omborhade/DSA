package ARRAY;

public class AbsoluteDifference {
    //- Given an array sorted in increasing order of size n and an integer x, find if there exists a
    //pair in the array whose absolute difference is exactly x.(n>1)
    public  static  String CheckDiff(int arr[], int x){
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = arr.length-2; j >=0 ; j--) {
                if(arr[i]-arr[j]==x){
                    return "Yes";
                }

            }

        }
        return  "No";
    }

    public static void main(String[] args) {
        int arr[]={5,15,20,25};
        int x = 7;

        System.out.println(CheckDiff(arr,x));
    }
}
