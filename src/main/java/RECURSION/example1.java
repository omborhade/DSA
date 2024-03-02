package RECURSION;

public class example1 {
    public static void  func(int n){
        if(n>0){
            System.out.println(n);//ascending
            func(n-1);
        }

    }

    public static void main(String[] args) {
        func(5);
    }
}
