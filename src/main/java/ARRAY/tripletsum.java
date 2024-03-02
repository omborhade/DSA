package ARRAY;

public class tripletsum {
         //number of triplets pairs whose sum is same as target
    public  static  int countOfTripletspairs(int arr[], int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k <arr.length ; k++) {
                    if( arr[i]+arr[j]+arr[k]== target){
                        count++;
                    }
                }

            }

        }
        return  count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,5,3,5};
        System.out.println(countOfTripletspairs(arr,10));
    }
}
