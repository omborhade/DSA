package Array2D;

public class SpiralMatrix {

    public static void spiralPrint(int matrix[][]){

        int startRow=0;
        int endRow= matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while (startRow<=endRow&&startCol<=endCol) {
            //printring top elements
            for(int i =startCol;i<=endCol;i++){
                System.out.print(matrix[startRow][i]+" ");
            }
            //printing right elemnet
            for(int j=startRow+1;j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            //printing bottom element
            for(int i=endCol-1;i>=startCol;i--){
                if(startRow==endRow){
                    break;
                }
                System.out.print(matrix[endRow][i]+" ");
            }
            //printing left elemnt

            for(int j=endRow-1;j>startRow;j--){
                if(startCol==endCol){
                    break;
                }
                System.out.print(matrix[j][startCol] +" ");
            }
            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
    }

    public static void main(String[] args) {

        int matrix[][] = {{1,2,3,4}
                        ,{5,6,7,8}
                       ,{9,11,12,13}};
        spiralPrint(matrix);


    }
}
