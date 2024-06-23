package Lab4_SortingOfLinearArray_ROLLNO_283;
import java.util.Random;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
public class QuickSorting_Algorithm {
    public static void main(String[] args) {
        int n = 10;
        int[] accountBalances = new int[n];
        int[] accountNo = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            accountBalances[i] = random.nextInt(100001);
            accountNo[i] = i + 1;
        }
        System.out.println("Original Account Balances:");
        printAccounts(accountNo, accountBalances);
        quickSort(accountBalances, accountNo, 0, n - 1);
        System.out.println("______________________________________________");
        System.out.println("\nSorted Account Balances (highest to lowest):");
        printAccounts(accountNo, accountBalances);
    }

    static void quickSort(int[] balances, int[] accountNo, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(balances, accountNo, low, high);
            quickSort(balances, accountNo, low, partitionIndex - 1);
            quickSort(balances, accountNo, partitionIndex + 1, high);
        }
    }
    static int partition(int[] balances, int[] accountNo, int low, int high) {
        int pivot = balances[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (balances[j] >= pivot) {
                i++;
                int tempBalance = balances[i];
                balances[i] = balances[j];
                balances[j] = tempBalance;
                int tempAccountNo = accountNo[i];
                accountNo[i] = accountNo[j];
                accountNo[j] = tempAccountNo;
            }
        }
        int tempBalance = balances[i + 1];
        balances[i + 1] = balances[high];
        balances[high] = tempBalance;
        int tempAccountNo = accountNo[i + 1];
        accountNo[i + 1] = accountNo[high];
        accountNo[high] = tempAccountNo;

        return i + 1;
    }
    static void printAccounts(int[] accountNo, int[] accountBalances) {
        for (int i = 0; i < accountNo.length; i++) {
            System.out.println("Account No. " + accountNo[i] + " Balance " + accountBalances[i]);
        }
    }
}
