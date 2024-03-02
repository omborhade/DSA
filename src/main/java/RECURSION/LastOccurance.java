package RECURSION;

public class LastOccurance {

    public  static  int FindLastocc(int arr[],int key, int i){
        if(i== arr.length)return  -1;
        int Isfound = FindLastocc(arr,key,i+1);
        if (Isfound==-1&& arr[i]== key){
            return i;
        }
        return  Isfound;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,5,4,3};
        System.out.println(FindLastocc(arr,4,0));
    }
}
