package com.function;

public class primerevise {

    public static boolean check(int a){
        if(a==2){
            return true;
        }
        for (int i = 2; i <=Math.sqrt(a) ; i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    public static void primeinrange(int num){
        for (int i = 2; i <=num ; i++) {
            if(check(i)){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        primeinrange(20);
    }


}