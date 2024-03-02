package ARRAY;

public class largestval {

    public static int largestno(int numbers[]){
        int largestnumber = Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length ; i++) {
            if(largestnumber<numbers[i]){
                largestnumber=numbers[i];
            }

        }
        return largestnumber;
    }

    public static void main(String[] args) {
        int numbers[]={33,99,432,7754,9653,358,0222};
        System.out.println("largest no in given array is ="+largestno(numbers));

    }

}
