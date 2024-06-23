package Lab4PRC;

import java.util.Arrays;

public class DeletionInArray_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int new_size = array.length-1;
        int[] new_array = new int[new_size];
        int elementForDeletion = 3;
        int j = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != elementForDeletion){
                new_array[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(new_array));
    }
}
