// Q11) Write a Java Program conisting of following class


1) A class Number stores 9 cards number from 2 to 10 using nine no method and face card are stored using instance variable. A method suit determine cards from suit with number and colour of the 
card.Their is another method called face to find the face card from suit with color.


class Number {
    
    private String[] faceCards = {"Jack", "Queen", "King"};
    private String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private String cardNumber;
    private String cardFace;
    private String cardSuit;
    private String cardColor;

   
    public void setCardNumber(String number) {
        if (number.matches("[2-9]|10")) {
            this.cardNumber = number;
        } else {
            System.out.println("Invalid card number.");
        }
    }

   
    public void setCardFace(String faceCard) {
        if (isFaceCard(faceCard)) {
            this.cardFace = faceCard;
        } else {
            System.out.println("Invalid face card.");
        }
    }

    
    private boolean isFaceCard(String faceCard) {
        for (String face : faceCards) {
            if (face.equalsIgnoreCase(faceCard)) {
                return true;
            }
        }
        return false;
    }

   
    public void determineCard(String suit, String numberOrFace) {
        this.cardSuit = suit;
        if (isFaceCard(numberOrFace)) {
            this.cardFace = numberOrFace;
            this.cardColor = getColor(suit);
        } else {
            this.cardNumber = numberOrFace;
            this.cardColor = getColor(suit);
        }
    }

   
    private String getColor(String suit) {
        if (suit.equalsIgnoreCase("Hearts") || suit.equalsIgnoreCase("Diamonds")) {
            return "Red";
        } else {
            return "Black";
        }
    }

   
    public void displayCard() {
        if (cardFace != null) {
            System.out.println("Face Card: " + cardFace + " of " + cardSuit + " (" + cardColor + ")");
        } else {
            System.out.println("Card: " + cardNumber + " of " + cardSuit + " (" + cardColor + ")");
        }
    }
}


2)The man method is written in the class called Num Demo
Create a object of 10 cards with suit name and number or suit name and face card

public class NumDemo {
    public static void main(String[] args) {
        
        Number[] cards = new Number[10];

       
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] faceCards = {"Jack", "Queen", "King"};

       
        for (int i = 0; i < 6; i++) {
            cards[i] = new Number();
            cards[i].determineCard(suits[i % 4], numbers[i % 9]);
        }

      
        for (int i = 6; i < 10; i++) {
            cards[i] = new Number();
            cards[i].determineCard(suits[i % 4], faceCards[i % 3]);
        }

        
        for (Number card : cards) {
            card.displayCard();
        }
    }
}


3)To iniatilize an array of size no and find the largest and smallest integer in the array.Also display the array element 5 pet line and then display in the new line the largest and smallest 
integer.



import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        int size = 10; // Define the size of the array
        int[] numbers = new int[size];

       
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(100); 
        }

      
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if ((i + 1) % 5 == 0) {
                System.out.println();
            }
        }

        
        int largest = numbers[0];
        int smallest = numbers[0];

        for (int num : numbers) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }

        
        System.out.println("\nLargest integer: " + largest);
        System.out.println("Smallest integer: " + smallest);
    }
}
