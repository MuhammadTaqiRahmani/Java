package Lab4PRC;

import java.lang.reflect.Array;
import java.util.Arrays;

public class InsertionInArray {
    public static void main(String[] args) {
        int[] array = {10,30,40,50,60};
        int new_size = array.length+1;
//        int old_size = array.length;
        int merged_size = new_size;
        int[] new_array = new int[merged_size];
        for(int i = 0; i < array.length; i++){
            new_array[i] = array[i];
        }
        int value = 100;
        new_array[merged_size - 1] = value;
        System.out.println(Arrays.toString(new_array));
    }
}
