package com.function;

public class Armstrong_num {
    //if total 3 digits in given number then sum of cube of each digit is equal
    // to the given number then it called armstrong number

    public static void check(int num){
        int sum =0;
        int temp = num;
        while(num>0){
            int lastdigit = num%10;
            sum=(lastdigit*lastdigit*lastdigit)+sum;
            num= num/10;
        }
        if(sum==temp){
            System.out.println(" number is armstrong number");
        }else{
            System.out.println("number is not armstrong number");
        }
    }

    public static void main(String[] args) {
        check(372);
    }
}
