package Lab3_prc_byuser;

import java.util.Arrays;

public class SumOfRealNumbersAlgorithm {
    public static void sumOfRealNumbers(double[] array){
        System.out.println(Arrays.toString(array));
        double sum = 0.0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        System.out.println("SUM "+sum);

    }

    public static void main(String[] args) {
        double[] realNumbers = {3.5, 3.4, 1.2, 4.4, 3.1};
        SumOfRealNumbersAlgorithm obj = new SumOfRealNumbersAlgorithm();
        obj.sumOfRealNumbers(realNumbers);
    }
}
