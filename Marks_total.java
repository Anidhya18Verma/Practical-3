// Q10)  Write a Java Program conisting of following class

1)Class Marks_Total_2 stores the total marks obtained by 5 student in three subjects each.Student stores the roll number in another array corresponding to their marks.Write a method to find the 
totalmarks obtain by each students.Display Rank,rollno and total marks in decending order


import java.util.Arrays;
import java.util.Comparator;

public class Marks_Total_2 {
    // Array to store roll numbers and marks
    private int[] rollNumbers;
    private int[][] marks; // 2D array to store marks for each student in 3 subjects

    // Constructor to initialize the arrays
    public Marks_Total_2(int[] rollNumbers, int[][] marks) {
        this.rollNumbers = rollNumbers;
        this.marks = marks;
    }

    // Method to calculate total marks for each student and sort by total marks in descending order
    public void displayRank() {
        // Array to store total marks and corresponding roll number
        int[][] totalMarks = new int[rollNumbers.length][2];

        // Calculate total marks for each student
        for (int i = 0; i < rollNumbers.length; i++) {
            int sum = 0;
            for (int j = 0; j < marks[i].length; j++) {
                sum += marks[i][j];
            }
            totalMarks[i][0] = rollNumbers[i]; // Store roll number
            totalMarks[i][1] = sum; // Store total marks
        }

        // Sort the totalMarks array by total marks in descending order
        Arrays.sort(totalMarks, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        });

        // Display rank, roll number, and total marks
        System.out.println("Rank | Roll No | Total Marks");
        for (int i = 0; i < totalMarks.length; i++) {
            System.out.println((i + 1) + " | " + totalMarks[i][0] + " | " + totalMarks[i][1]);
        }
    }
}



2)Create a Marks_total class to create an object to invoke the method of above class.


public class Marks_total {
    public static void main(String[] args) {
        // Sample data
        int[] rollNumbers = {101, 102, 103, 104, 105};
        int[][] marks = {
            {85, 90, 78}, // Marks for student 101
            {88, 76, 92}, // Marks for student 102
            {70, 80, 65}, // Marks for student 103
            {90, 85, 88}, // Marks for student 104
            {78, 85, 90}  // Marks for student 105
        };

      
        Marks_Total_2 marksTotal = new Marks_Total_2(rollNumbers, marks);

       
        marksTotal.displayRank();
    }
}
