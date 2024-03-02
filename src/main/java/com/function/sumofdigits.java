package com.function;

public class sumofdigits {
    public static void check(int num){
        int sum = 0;
        while(num>0){
            int remainder = num%10;
            sum=sum+remainder;
            num= num/10;
        }
        System.out.println("sum of all digits in number is "+sum);
    }

    public static void main(String[] args) {
        check(1663);
    }
}
