package ARRAY;

public class LeaderInArray {

    public  static  void Leader(int arr[]){
       int leader=  arr[arr.length-1];

        System.out.print(leader);
        for (int i = arr.length-2; i >=0 ; i--) {
            if(arr[i]>leader){
              leader=arr[i];
                System.out.print(leader);
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={8,11,5,11,7,6,3};
        Leader(arr);
    }
}
