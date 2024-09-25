// Q6) Write a java program to display 2*2 matrix and find their product


public class MatrixProduct {
    public static void main(String[] args) {
       
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

     
        int[][] productMatrix = new int[2][2];

       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                productMatrix[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    productMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("Product Matrix:");
        displayMatrix(productMatrix);
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

