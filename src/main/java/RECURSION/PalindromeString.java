package RECURSION;

public class PalindromeString {
    //in this example for checking string is palindrome or not first we check extreme postion are same or not with the
    //help of l and r variable  if thiis match then check iner substring is palin drome or not by function calling

   static  boolean  IsPalindrome(String s){
        return  IsPalindromehelper(s,0,s.length()-1);
    }
    static  boolean IsPalindromehelper(String s , int l , int r){
        if(l>=r)return true;//base case
        if(s.charAt(l)==s.charAt(r)){
            return IsPalindromehelper(s,l+1,r-1);

        }else {
            return  false;
        }

    }


    public static void main(String[] args) {
        System.out.println(IsPalindrome("acca"));
    }
}
