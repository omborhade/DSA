package ARRAY;

public class arraysBasics {

    public  static void swap(int a, int b){//swap two numbers without using temp
         a= a+b;  //3+5=8
         b= a-b; //8-5=3;
         a= a-b;// 8-3=5
        System.out.println(a);
        System.out.println(b);

    }

    public  static void reversarray(int arr[]){

     int   i = 0;
    int   j= arr.length-1;
       while (i<j){
           int temp= arr[i];
           arr[i]= arr[j];
           arr[j]= temp;

           i++;
           j--;
       }



    }
    public static void main(String[] args) {

        swap(3,5);
        int arr[]={ 2,3,4,7,4,8};
        reversarray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }

    }
}
