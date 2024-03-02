package ARRAY;

public class binarysearch {

    public static int indexbybinarys(int numbers[],int key){
        int start = 0;
        int end = numbers.length-1;
        while (start<=end){
            //find mid
            int mid =(start+end)/2;
            //compare mid
            if(numbers [mid]==key){
                return mid;
            }
            if(numbers[mid]>key){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {

        int numbers []={82,84,87,89,95,99,100};
        int key = 99;
        System.out.println("index ofs key is "+indexbybinarys(numbers,key));

    }
}
