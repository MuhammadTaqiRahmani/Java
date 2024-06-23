package MicrosoftEmployeeManagementSystem_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Random;
public class RecordOfDirectors {
    public static int[] recordOfDirectors(int[] file){
        System.out.println("SNo            Director ID                      Report File");
        for(int i = 0; i < file.length; i++){
            int ids_ran = new Random().nextInt(200)+400;
            file[i] = ids_ran;
        }
        int k = 201;
        int f = 1;
        for(int j = 0; j < file.length; j++){
            System.out.println(f++ +"                  "+file[j]+"                                "+k++ +"Ds");

        }
        return file;
    }
    public static void bubbleSorting(int[] file){
        System.out.println("SNo            Director ID                      Report File");
        for(int i = 0; i < file.length; i++) {
            for (int j = 0; j < (file.length - 1); j++) {
                if (file[j] > file[j + 1]) {
                    int temp = file[j];
                    file[j] = file[j + 1];
                    file[j + 1] = temp;
                }
            }
        }
        int k = 201;
        int f = 1;
        for(int j = 0; j < file.length; j++){
            System.out.println(f++ +"                  "+file[j]+"                                "+k++ +"Ds");

        }
    }
}
