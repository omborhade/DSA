package Strings;

import java.util.Scanner;

public class Palindrome {

    public static  boolean checkpalindrome(String name){
        for (int i = 0; i <name.length()/2; i++) {
            int n = name.length();
            if(name.charAt(i)!=name.charAt(n-1-i)){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTE THE STRING =" );
       String name = sc.nextLine();
       // System.out.println(checkpalindrome(name));
        if(checkpalindrome(name)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("not palindrome");
        }




    }
}
