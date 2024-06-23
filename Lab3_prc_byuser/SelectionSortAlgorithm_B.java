package Lab3_prc_byuser;

import java.util.Arrays;

public class SelectionSortAlgorithm_B {
    public static void sortingALG(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
//            swapping
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] data = {30,20,10,60,50};
        System.out.println(Arrays.toString(data));
        SelectionSortAlgorithm_B obj = new SelectionSortAlgorithm_B();
        obj.sortingALG(data);
    }
}
