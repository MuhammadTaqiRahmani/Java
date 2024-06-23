package Lab2_Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class GFG {
    public static void main(String args[]){
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(221, "Rameez", 25));
        arraylist.add(new Student(242, "Zain", 26));
        arraylist.add(new Student(211, "Aijaz", 30));

        Collections.sort(arraylist);

        for(Student str: arraylist){
            System.out.println(str);
        }
    }
}

