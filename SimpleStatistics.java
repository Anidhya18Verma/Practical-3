// Q3) Write a Java Program to find the mean and standard deviation of an array of numbers


public class SimpleStatistics {
    public static void main(String[] args) {
        
        int[] numbers = {10, 20, 30, 40, 50};

       
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);

       
        double standardDeviation = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

    
    public static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    
    public static double calculateStandardDeviation(int[] numbers, double mean) {
        double sum = 0;
        for (int number : numbers) {
            sum += Math.pow(number - mean, 2);
        }
        return Math.sqrt(sum / numbers.length);
    }
}
