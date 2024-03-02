package com.function;

public class SumOfDigitsInNo {

    public static int  sumcheck(int number){

         int sum = 0;
         while (number>0){

            int lastdigit = number% 10;
            sum = sum+lastdigit;
            number/= 10;

        }

      return sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of digits in given no is : "+ sumcheck(66));
    }
}
