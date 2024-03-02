package Array2D;

public class DiagonalSum {

    public  static  int diagonalSum(int[][] mat) {

        int sum=0;
        for(int i=0;i<mat.length;i++){
            sum+=mat[i][i];   //primary diagonal
            int j= mat.length-1-i;//for not adding on element more than one time
            if(i !=j){
                sum+=mat[i][j];//secondary diagonal
            }

        }
        return sum;


    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(diagonalSum(mat));
    }
}
