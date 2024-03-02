package RECURSION;

public class TilingPrblm {

    public  static  int Tilingway(int n){
        if(n==0||n==1){
            return  1;
        }
        return  Tilingway(n-1)+Tilingway(n-2);
    }

    public static void main(String[] args) {
        System.out.println(Tilingway(3));
    }
}
