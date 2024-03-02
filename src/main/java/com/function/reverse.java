package com.function;

public class reverse {
    public static void reverseint( int number){
        int rev = 0;
        while ( number> 0) {
            int lastdigit = number % 10;
            rev = rev * 10 + lastdigit;
           // System.out.print(lastdigit);
            number = number / 10;
        }
            System.out.println(rev);



    }

    public static void main(String[] args) {
        reverseint(2125);
    }
}