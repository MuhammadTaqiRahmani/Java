package Lab3_prc_byuser;

import java.util.Arrays;

public class SelectionSortingAlgorithm_283F {
    public static void sorting283F(int[] inputArray){
        for(int i = 0; i < inputArray.length; i++){
            int min = i;
            for(int j = i+1; j < inputArray.length; j++){
                if(inputArray[j] < inputArray[min]){
                    min = j;
                }
            }
            //        swapping
            int temp = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min] = temp;
        }
        System.out.println(Arrays.toString(inputArray));

    }

    public static void main(String[] args) {
        SelectionSortingAlgorithm_283F obj = new SelectionSortingAlgorithm_283F();
        int[] sectionF = {210,254,252,260,233,283,270,298,285};
        obj.sorting283F(sectionF);
    }
}
