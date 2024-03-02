package RECURSION;

public class fibonacii {
    //base case for this example is  n>=1
    //time complexity is 2^n
    //fibo at index 5 = f(5-1)+f(5-2)
    static int fibo(int n){
        if(n>=1)return n;
        return fibo(n-1)+fibo(n-2);
    }


    public static void main(String[] args) {
        System.out.println(fibo(5));
    }
}
