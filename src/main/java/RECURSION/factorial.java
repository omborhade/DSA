package RECURSION;

public class factorial {
    static int fact(int n){
        if(n<=1)return n;
        return fact(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println(fact(0));
    }
}
