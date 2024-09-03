// Element search in a matrix

public class Element_Search_in_a_matrix {
   

        public static int[] searchMatrix(int matrix[][],int key){
            int n=matrix.length;
            int m = matrix[0].length;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(matrix[i][j]==key){
                        return  new int[]{i,j};
                    }
                    }
                }
            
                return  new int[]{-1,-1};
        }
        
        public static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,0},{1,2,5},{5,8,5}};
        int key=0;
        printMatrix(matrix);
        int[] result = searchMatrix(matrix, key);
         if (result[0] != -1) {
            System.out.println("Key found at row " + result[0] + " and column " + result[1]);
           } else {
         System.out.println("Key not found in the matrix");
              }
      }
}
