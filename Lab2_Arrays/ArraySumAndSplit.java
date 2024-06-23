//Muhammad Taqi Rahmani - 283 - F - BSE
package Lab2_Arrays;
public class ArraySumAndSplit {
    public static void main(String[] args) {
        double[] realNumbers = {3.5, 1.2, 4.8, 2.0, 6.7, 5.1, 9.3};

        // Calculate the sum and mean
        double sum = 0.0;
        for (double num : realNumbers) {
            sum += num;
        }

        double mean = sum / realNumbers.length;

        // Display the array, sum, and mean
        System.out.println("Array of real numbers:");
        for (double num : realNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nSum: " + sum);
        System.out.println("Mean: " + mean);

        // Split the array at a key
        double keyToSplit = 2.0;
        double[][] splitResult = splitArray(realNumbers, keyToSplit);

        if (splitResult != null) {
            System.out.println("\nArray split at " + keyToSplit);
            System.out.print("First Part: ");
            for (double num : splitResult[0]) {
                System.out.print(num + " ");
            }
            System.out.println("\nSecond Part: ");
            for (double num : splitResult[1]) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("\nKey not found in the array.");
        }
    }

    // Method to split the array at a key
    public static double[][] splitArray(double[] array, double key) {
        int keyIndex = -1;

        // Find the index of the key
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                keyIndex = i;
                break;
            }
        }

        if (keyIndex == -1) {
            return null; // Key not found
        }
        double[] firstPart = new double[keyIndex];
        double[] secondPart = new double[array.length - keyIndex - 1];

        for (int i = 0; i < keyIndex; i++) {
            firstPart[i] = array[i];
        }

        for (int i = keyIndex + 1; i < array.length; i++) {
            secondPart[i - keyIndex - 1] = array[i];
        }

        return new double[][]{firstPart, secondPart};
    }
}
