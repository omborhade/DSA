package ArrayListt;

import java.util.ArrayList;

public class PairSum2 {

    //given array list is  sorted and rotated
    //optimal approach using two pointers
 public  static boolean pairsum(ArrayList<Integer>al, int target){
     int bp=-1;
     int n= al.size();
     for (int i = 0; i <al.size() ; i++) {
         if (al.get(i) > al.get(i + 1)) {
             bp = i;
             break;
         }
     }

         int lp = bp+1;
         int rp = bp;

         while (lp!=rp){
             //case one
             if(al.get(lp)+al.get(rp)==target){
                 return  true;
             }
             //case 2
              if(al.get(lp)+ al.get(rp)<target){
                 lp= (lp+1)% n;
             }
             //case 3
             else{
                 rp = (n+ rp-1) % n;
             }

         }


     return  false;
 }
    public static void main(String[] args) {
        ArrayList<Integer>al = new ArrayList<>();
        al.add(11);
        al.add(15);
        al.add(6);
        al.add(8);
        al.add(9);
        al.add(10);

        System.out.println(pairsum(al,26));

    }
}
