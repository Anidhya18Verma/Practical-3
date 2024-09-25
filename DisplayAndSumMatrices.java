// Q7) Write a Java program to initialize a 2 dimension array of 2*2.Program should display 3 array


public class DisplayAndSumMatrices {
    public static void main(String[] args) {
        
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

        
        int[][] sumMatrix = new int[2][2];

       
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
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

