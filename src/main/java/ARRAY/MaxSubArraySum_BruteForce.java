package ARRAY;

public class MaxSubArraySum_BruteForce {

    public static void printsubarr(int numbers[]){
       //int totalsubarray = 0;
        int sum =0;
        int Maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <numbers.length ; i++) {  //start
            int start = i;
            sum=0;
            for (int j = i; j <numbers.length ; j++) {  //end
                int end = j;
                sum=0;
                for (int k =start ; k<=end; k++) {
                    System.out.print(numbers[k]+" ");
                    sum= sum+numbers[k];
                }
                System.out.print(" sum is"+sum);

                if(sum>Maxsum){
                    Maxsum=sum;
                }


               // totalsubarray++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("maximum sum of subarray is ="+Maxsum);

    }
    public static void main(String[] args) {

        int numbers[]={1,-2,6,-1,3};
        printsubarr(numbers);
    }
}
