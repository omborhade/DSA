package Sorting;

public class Selectionsort {

    public static void selectionsort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            //for finding smallest no

            int minimumpostion = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimumpostion] > arr[j]) {
                    minimumpostion = j;

                }
            }
            //swap
            int temp = arr[minimumpostion];
            arr[minimumpostion] = arr[i];
            arr[i] = temp;
        }
        }
        public static void printarr(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args) {
        int arr[]={3,7,8,4,2,9};
        selectionsort(arr);
        printarr(arr);
    }
}
