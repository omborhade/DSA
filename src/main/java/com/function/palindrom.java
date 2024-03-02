package com.function;
import java.util.*;
public class palindrom {
    public static boolean isPalindrome(int number){

        int palindrome = number;//copie number in variable
        int rev = 0;

        while (palindrome!=0){
            int remainder = palindrome%10;
            rev= rev*10 +remainder;
            palindrome = palindrome/10;
        }
        if(number==rev){
            return  true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER =");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("NUMBER : "+palindrome +" IS PALINDROME");
        }else {
            System.out.println("NUMBER : "+palindrome +" IS NOT PALINDROME");
        }
    }
}
