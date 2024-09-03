// Search in sorted matrix

public class Search_in_sorted_matrix {
    public static int[] sortedMatrix(int matrix[][], int key){
        int endrows=matrix.length-1;
        int startcols=0;
        while (startcols<matrix[0].length&&endrows>=0) {
            if(matrix[endrows][startcols]==key){
                return new int[]{endrows,startcols};
            }
            if(matrix[endrows][startcols]>key){
                endrows--;
            }else{
                startcols++;
            }
        }
        return new int[]{-1,-1};
       
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
                       int key=40;
                       int[] result = sortedMatrix(matrix, key);
                       if (result[0] != -1) {
                          System.out.println("Key found at row " + result[0] + " and column " + result[1]);
                         } else {
                       System.out.println("Key not found in the matrix");
                            }
                    }
              }
        
