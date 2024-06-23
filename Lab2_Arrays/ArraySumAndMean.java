//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
public class ArraySumAndMean {
    public static void main(String[] args) {
        double[] realNumbers = {3.5, 1.2, 4.8, 2.0, 6.7, 5.1, 9.3};
        double sum = 0.0;
        for (double num : realNumbers) {
            sum += num;
        }
        double mean = sum / realNumbers.length;
        System.out.println("Array of real numbers:");
        for (double num : realNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);
    }
}
