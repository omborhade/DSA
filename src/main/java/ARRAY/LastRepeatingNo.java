package ARRAY;

public class LastRepeatingNo {
    //find the last repeating number in an array

    public  static  int LastRpeatingNo(int arr[]){
        for (int i = arr.length-1; i >=0; i--) {
            for (int j = arr.length-2; j >=0; j--) {
                if(arr[i]==arr[j]){
                    return  arr[i];
                }

            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={3,4,3,5,4,2,5,8,7,6,8};
        System.out.println(LastRpeatingNo(arr));
    }
}
