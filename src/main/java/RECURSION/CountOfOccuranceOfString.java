package RECURSION;

public class CountOfOccuranceOfString {
    //we are checking how many times our target string is occur in substring/subproblem
    //if it occur 1 time then we check target string is match with  i to t.length
    //if this match then we add + 1;
    //we need one i index variable for checking

    public static  int NoOFOccurance(String t,String s ){
        return NoOfOccuranncehelper(t,s,0);
    }
    public  static  int NoOfOccuranncehelper(String t, String s, int i){
        if(i>s.length() - t.length()) {
            return  0;}
        int SubProblemAnswer= NoOfOccuranncehelper(t,s,i+1);
        boolean DoStartingCharMatch =s.substring(i, i+t.length()).equals(t);
        if(DoStartingCharMatch) return  SubProblemAnswer + 1;

        else   {  return SubProblemAnswer;}

    }

    public static void main(String[] args) {
        System.out.println(NoOFOccurance("aba", "ababbabac"));
    }
}
