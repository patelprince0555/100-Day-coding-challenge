// print largest element in matrix

public class print_largest_Element_in_matrix {
    public static void largestElement(int matrix[][]){
        int n=matrix.length;
        int m= matrix[0].length;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,0},{1,2,5},{5,8,5}};
        largestElement(matrix);
        
    }
}
