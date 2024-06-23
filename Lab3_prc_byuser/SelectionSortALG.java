package Lab3_prc_byuser;

import java.util.Arrays;

public class SelectionSortALG {
    public static void selectionSortALG(int[] array){
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
//            swapping
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        System.out.println("Sorted Array");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] data = {40,20,10,70,30};
        System.out.println(Arrays.toString(data));
        SelectionSortALG obj = new SelectionSortALG();
        obj.selectionSortALG(data);
    }
}
