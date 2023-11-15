package Lab01;

import java.util.Arrays;

public class ArraySortSumAverage {
    public static void main(String[] args) {
        // Create an array of double values.
        double[] numbers = {12.5, 7.6, 19.6, 3.2, 5.8, 10.4};

        // Sort the array in ascending order.
        Arrays.sort(numbers);

        // Initialize a variable to store the sum of the array elements.
        double sum = 0.0;

        // Iterate through the sorted array and calculate the sum of its elements.
        for (double num : numbers) {
            sum += num;
        }

        // Calculate the average of the array elements by dividing the sum by the number of elements.
        double average = sum / numbers.length;

        // Print the sorted array to the console.
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Print the sum of the array elements to the console.
        System.out.println("Sum of array elements: " + sum);

        // Print the average of the array elements to the console.
        System.out.println("Average of array elements: " + average);
    }
}
