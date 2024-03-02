package com.function;

public class palindromerevise {

    public static void check(int num){
        int temp = num;
        int rev = 0;
        while(num>0){
            int remainder = num%10;
            rev=(rev*10)+remainder;
            num= num/10;
        }
        if(rev==temp){
            System.out.println("number "+temp+" is palindrome");
        }else {
            System.out.println("number "+temp+" is not palindrome");
        }

    }

    public static void main(String[] args) {
        check(123);
    }
}
