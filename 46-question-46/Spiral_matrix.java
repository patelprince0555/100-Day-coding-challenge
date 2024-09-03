// spiral matrix
// int matrix= 1,2,3,4
//             5,6,7,8
//             9,10,11,12
//             13,14,15,16

// output 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10

public class Spiral_matrix {


    public static void spiralMatrix(int matrix[][]){
        int startcols=0;
        int endcols=matrix[0].length-1;
        int startrows=0;
        int endrows=matrix.length-1;
        while(startrows<=endrows&&startcols<=endcols){
            for(int i=startcols;i<=endcols;i++){
                System.out.print(matrix[startcols][i]+" ");
            }
            for(int j=startrows+1;j<=endrows;j++){
                System.out.print(matrix[j][endcols]+" ");
            }
            for(int i=endcols-1;i>=startcols;i--){
                if(startrows==endrows){
                    break;
                }
                System.out.print(matrix[endrows][i]+" ");
            }
            for(int j=endrows-1;j>=startrows+1;j--){
                if(startcols==endcols){
                    break;
                }
                System.out.print(matrix[j][startcols]+" ");
            }
            startrows++;
            startcols++;
            endcols--;
            endrows--;
        }
    }
    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
                         spiralMatrix(matrix);
        
    }
}
