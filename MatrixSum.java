// Q5) Write a java program to initialize an array of order 2*3 matrix and find their sums.Progaram should display 3 arrays


public class MatrixSum {
    public static void main(String[] args) {
       
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrix2 = {
            {7, 8, 9},
            {10, 11, 12}
        };

       
        int[][] sumMatrix = new int[2][3];

       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        System.out.println("Sum Matrix:");
        displayMatrix(sumMatrix);
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

