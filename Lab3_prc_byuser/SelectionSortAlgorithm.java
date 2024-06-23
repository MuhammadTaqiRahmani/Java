package Lab3_prc_byuser;

import java.util.Arrays;

public class SelectionSortAlgorithm {
    public void sort(int inputArray[]){

        int temp;

        for(int i = 0; i < inputArray.length; i++){
            int min = i;

            for(int j = i+1; j < inputArray.length; j++){


                if(inputArray[j] < inputArray[min] ){
                    min = j;
                }
            }

            //Swap
            temp = inputArray[i];
            inputArray[i] = inputArray[min];
            inputArray[min] = temp;
        }
        System.out.println(Arrays.toString(inputArray));

    }

    public static void main(String[] args) {
        int[] inputArray = {34,5,2,16,43,33,21};
        SelectionSortAlgorithm obj = new SelectionSortAlgorithm();
        obj.sort(inputArray);
    }
}
