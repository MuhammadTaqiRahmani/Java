package Lab3_prc_byuser;

import java.util.Arrays;

public class SumOfRealNumbersAlgorithm_283F {
    public static void sumAndMeanOfRealNumbers(double[] array) {
        System.out.println(Arrays.toString(array));
        double sum = 0.0;
        for(int i = 0; i < array.length; i++){
            sum = sum + array[i];
        }
        double mean = sum / array.length;
        System.out.println("SUM of real numbers: "+sum);
        System.out.println("MEAN of real numbers: "+mean);


    }

    public static void main(String[] args) {
        double[] realNumbers = {3.4, 2.3, 4.3, 1.5, 6.2, 2.2, 4.4};
        SumOfRealNumbersAlgorithm_283F obj = new SumOfRealNumbersAlgorithm_283F();
        obj.sumAndMeanOfRealNumbers(realNumbers);
    }
}
