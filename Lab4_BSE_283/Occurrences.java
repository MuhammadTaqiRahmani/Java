package Lab4_BSE_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.HashMap;
import java.util.Map;
public class Occurrences {
    public static void occurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.print(entry.getKey() + " " + entry.getValue() + "; ");
        }
    }
    public static void main(String[] args) {
        int[] dataset = {55, 1, 0, 11, 0, 3, 5, 1, 0, 12};
        System.out.println("Data set");
        occurrences(dataset);
    }
}
