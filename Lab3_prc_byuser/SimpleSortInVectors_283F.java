package Lab3_prc_byuser;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class SimpleSortInVectors_283F {
    private static Vector<Integer> vector = new Vector<>();
    public static Vector<Integer> simpleSort(){
        System.out.println("Vectors");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the range of vector array:: ");
        int range = input.nextInt();
        for(int i = 0; i < range; i++){
            System.out.print("Enter an element:: ");
            int element = input.nextInt();
            vector.add(element);
        }
        Collections.sort(vector);
        return vector;

    }

    public static void main(String[] args) {
        System.out.println(simpleSort());
    }
}
