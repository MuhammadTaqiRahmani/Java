//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
package Lab3_Recursion;
import java.util.HashMap;
public class Memoization_Fibonacci {
    private static HashMap<Integer, Long> memoizationTable = new HashMap<>();

    public static long findNthFibonacci(int n) {
        if (memoizationTable.containsKey(n)) {
            return memoizationTable.get(n);
        }
        // Base cases: F(0) = 0 and F(1) = 1.
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        long nthFibonacci = findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
        memoizationTable.put(n, nthFibonacci);

        return nthFibonacci;
    }

    public static void main(String[] args) {
        int n = 10;
        long result = findNthFibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

}

