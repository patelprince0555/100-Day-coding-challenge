// print smalllest element in a matrix

public class print_smallest_element_in_matrix {
    public static void smallestElement(int matrix[][]){
        int n=matrix.length;
        int m= matrix[0].length;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
            }
        }
        System.out.println(smallest);
    }
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,0},{1,2,5},{5,8,5}};
        smallestElement(matrix);
    }
}
