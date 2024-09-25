// Q2) Write a Java program to sort numbers given by an array
import java.util.Arrays;  

public class SortArray {
    public static void main(String[] args) {
        
        int[] numbers = {25, 10, 5, 80, 30, 45};

        
        System.out.println("Original Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

  
        Arrays.sort(numbers);

      
        System.out.println("\n\nSorted Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}