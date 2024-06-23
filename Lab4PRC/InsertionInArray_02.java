package Lab4PRC;

import java.util.Arrays;

public class InsertionInArray_02 {
    public static void insertion(int[] array){
        int new_size = array.length + 2;
        int[] new_array = new int[new_size];
        for(int i = 0; i < array.length; i++){
            new_array[i] = array[i];
        }
        int value = 1000;
        int value2 = 2000;
        new_array[new_size-2] = value;
        new_array[new_size-1] = value2;
        System.out.println(Arrays.toString(new_array));

    }
    public static void main(String[] args) {
        int[] data = {10,20,30,40,50,60};
        insertion(data);
    }
}
