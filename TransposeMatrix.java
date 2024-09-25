// Q8) Write a Java Program to initialize a 2 dimension array of 4*3 and to find its transverse


public class TransposeMatrix {
    public static void main(String[] args) {
       
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
            {10, 11, 12}
        };

       
        int[][] transposeMatrix = transpose(matrix);

       
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

       
        System.out.println("Transposed Matrix:");
        displayMatrix(transposeMatrix);
    }

   
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

   
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
        System.out.println(); 
    }
}
