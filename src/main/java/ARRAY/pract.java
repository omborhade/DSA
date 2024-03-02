package ARRAY;
import java.util.*;
public class pract {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n/2; i++) {
            if(n%i==0){
                System.out.println(i);
            }

        }
    }


}
