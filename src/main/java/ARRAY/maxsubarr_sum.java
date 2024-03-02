package ARRAY;

public class maxsubarr_sum {
    public static void  maxsumofsub_arr(int number[]){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;
        for (int i = 0; i < number.length ; i++) {
            int start = i;
            for(int j =1;j< number.length;j++){
                int end = j;
                                for(int k = start;k<=end;k++){
                    currsum=currsum+number[k];
                }
                System.out.println(currsum);
                if(currsum>maxsum){
                    maxsum=currsum;
                }
            }

        }
        System.out.println("max sum of sub array is"+maxsum);
    }
    public static void main(String[] args) {
        int number[]={1,2,5,3,8,3,88,44};
        maxsumofsub_arr(number);
    }
}
