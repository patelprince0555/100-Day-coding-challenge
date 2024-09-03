import java.util.Arrays;

public class sort_2D_Array {
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
        int[][] matrix = {
            {3, 2, 1},
            {9, 7, 8},
            {4, 6, 5}
        };

        // Flatten the 2D array into a 1D array
        int[] flatArray = Arrays.stream(matrix).flatMapToInt(Arrays::stream).toArray();

        // Sort the 1D array
        Arrays.sort(flatArray);

        // Rebuild the sorted 1D array back into the 2D array
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = flatArray[index++];
            }
        }

        // Print the sorted 2D array
        printMatrix(matrix);
    }
}
