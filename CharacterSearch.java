// Q9) Write a Java Program to search a particular character from array


import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
       
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

       
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

      
        boolean found = searchCharacter(charArray, searchChar);

        
        if (found) {
            System.out.println("Character '" + searchChar + "' is present in the array.");
        } else {
            System.out.println("Character '" + searchChar + "' is not present in the array.");
        }

       
        scanner.close();
    }

    public static boolean searchCharacter(char[] array, char target) {
        for (char c : array) {
            if (c == target) {
                return true; 
            }
        }
        return false; 
    }
}
