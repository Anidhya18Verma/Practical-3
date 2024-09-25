Q1) Write a Java Program to illustrate the concept of array (1 and 2 dimensional)

public class ArrayExample {
    public static void main(String[] args) {
        
        System.out.println("One-Dimensional Array:");
        int[] oneDimensionalArray = {10, 20, 30, 40, 50};

        for (int i = 0; i < oneDimensionalArray.length; i++) {
            System.out.println("Element at index " + i + ": " + oneDimensionalArray[i]);
        }

        System.out.println("\nTwo-Dimensional Array:");
        int[][] twoDimensionalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "]: " + twoDimensionalArray[i][j]);
            }
        }
    }
}