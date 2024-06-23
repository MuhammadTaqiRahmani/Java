package Lab4_SortingOfLinearArray_ROLLNO_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Arrays;

public class SelectionSort_Algorithm {
    public static void sorting(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }
//            swapping
            int temp_var = array[i];
            array[i] = array[min];
            array[min] = temp_var;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        System.out.println("Data of position holders in school");
        int[] data = {30,44,21,43,83,55,69};
        System.out.println("Array before sorting\n"+Arrays.toString(data));
//        after sorting
        SelectionSort_Algorithm obj = new SelectionSort_Algorithm();
        System.out.println("Array after sorting");
        obj.sorting(data);

    }
}
