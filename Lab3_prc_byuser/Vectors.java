package Lab3_prc_byuser;

import java.util.Vector;

public class Vectors {
    public static Vector<Integer> vectorsPresentation(){
        Vector<Integer> vector = new Vector<>();
        for(int i = 0; i < 10; i++){
            vector.add(i);
        }
        for(int value:vector){
            System.out.println(value);
        }
        int sum = 0;
        for(int value:vector){
            sum = sum + value;

        }
        System.out.println("Sum: "+sum);
        return vector;
    }
    public static void main(String[] args) {
        vectorsPresentation();
    }
}
