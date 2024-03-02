package com.function;

public class prime {
     public static boolean check(int a){
         if( a==2){
             return true;
         }
         for (int i = 2;i<=Math.sqrt(a);i++){
             if(a%i== 0) {
                 return false;
             }
         }
     return  true;
     }

     public static void primeinRange(int n){
         for (int i = 2;i<=n ;i++){
             if(check(i)){
                 System.out.print(i+ " ");
             }
         }
         System.out.println();
     }

    public static void main(String[] args) {
       // primeinRange(20);

        if(check(10)){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
}

