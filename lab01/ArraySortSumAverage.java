package Lab01;

import java.util.Arrays;

public class ArraySortSumAverage {
    public static void main(String[] args) {
        double[] numbers = {12.5, 7.6, 19.6, 3.2, 5.8, 10.4};
        Arrays.sort(numbers);
        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / numbers.length;

        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);
    }
}
