package RECURSION;

public class PrintSubSetOfString {
    //logic =  we take one cuurent string as empty string and take one varible index i which sraet from 0
    // we performing 2 operations 1) add that char at i in cureent string
                              //  2) dont add that char at i in current string
    //and we preint the current string
    //base case is if(i==s.length) return current string

     public static  void SubSetOfString(String s){
                               SubsetOfStringhelper(s,"", 0);
     }
     public  static  void SubsetOfStringhelper(String s, String cur, int i){
             if(i==s.length()){
                  System.out.println(cur);
                  return;
             }
              SubsetOfStringhelper(s,cur+s.charAt(i), i+1);
              SubsetOfStringhelper(s,cur,i+1);

     }

     public static void main(String[] args) {
          SubSetOfString("abcd");
     }
}


















































































