package RECURSION;

public class SumOf_N_NaturalNO {
    //base condition for this example is  n==1
    //time complexity is 2^n+1-1

    static int  sumofN(int n){
        if(n==1)return 1;
        return sumofN(n-1)+n;

    }

    public static void main(String[] args) {
        System.out.println(sumofN(6));
    }
}
