package Lab3_prc_byuser;

import java.util.Vector;

public class Vectors_2 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i <= 10; i++){
            vector.add(i);
        }
        int sum = 0;
        for(int i = 0; i < vector.size(); i++){
            int value = vector.get(i);
            System.out.println(value);
            sum = sum + value;

        }
        System.out.println("Sum: "+sum);
    }
}
