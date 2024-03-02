package ArrayListt;

import java.util.ArrayList;

public class SumOfElements {

   public  static  void sum(ArrayList<Integer> al ){
         int sum=0;
       for (int i = 0; i <al.size() ; i++) {
            sum+=al.get(i);
       }
       System.out.println(sum);
   }

    public  static  void max(ArrayList<Integer> al ){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i <al.size() ; i++) {
            if(al.get(i)>max){
                max= al.get(i);
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        ArrayList<Integer>al = new ArrayList<>();
        al.add(5);
        al.add(6);
        al.add(9);

       // sum(al);
        max(al);
    }
}
