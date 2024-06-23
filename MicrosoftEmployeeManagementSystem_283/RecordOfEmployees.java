package MicrosoftEmployeeManagementSystem_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Random;
public class RecordOfEmployees {
    public static int[] recordOfEmployees(int[] fileEmp){
        System.out.println("SNo            Employee ID                      Report File");
        for(int i = 0; i < fileEmp.length; i++){
            int ids_ran = new Random().nextInt(200)+400;
            fileEmp[i] = ids_ran;
        }
        int k = 501;
        int f = 1;
        for(int j = 0; j < fileEmp.length; j++){
            System.out.println(f++ +"                  "+fileEmp[j]+"                                "+k++ +"Es");

        }
        return fileEmp;
    }
    public static int[] hired(int[] dataOfEmp, int hiredEmp){
        int new_size_dataOfEmp = dataOfEmp.length + hiredEmp;
        int[] dataOfEmp_02 = new int[new_size_dataOfEmp];
        for(int i = 0; i < dataOfEmp.length; i++){
            dataOfEmp_02[i] = dataOfEmp[i];
        }
        System.out.println("No of new Employees hired:: "+hiredEmp);
        System.out.println("Generating new data");
        System.out.println("");
        System.out.println("SNo         ID of Employees                      Report File");
        for(int i = dataOfEmp.length; i < dataOfEmp_02.length; i++){
            int ids_ran = new Random().nextInt(200)+500;
            dataOfEmp_02[i] = ids_ran;
        }
        int k = 601;
        int f = 1;
        for(int j = 0; j < dataOfEmp_02.length; j++){
            System.out.println(f++ +"                  "+dataOfEmp_02[j]+"                                "+k++ +"Es");

        }
        return dataOfEmp_02;

    }
    public static int[] updateRecord(int[] dataOfEmp, int employeeId, int index){
        if(dataOfEmp.length > index){
            for(int i = 0; i < dataOfEmp.length; i++){
                if(index == i){
                    dataOfEmp[i] = employeeId;
                }
            }
            int f = 1;
            int k = 601;
            System.out.println("SNo         ID of Employees                      Report File");
            for(int j = 0; j < dataOfEmp.length; j++){
                System.out.println(f++ +"                  "+dataOfEmp[j]+"                                "+k++ +"Es");
            }
        }else{
            System.out.println("Index out of Range");
        }
        return dataOfEmp;
    }
    public static int[] selectionSort(int[] dataOfEmp){
        for(int i = 0; i < dataOfEmp.length; i++){
            int min = i;
            for(int j = i + 1; j < dataOfEmp.length; j++){
                if(dataOfEmp[j] < dataOfEmp[min]){
                    min = j;
                }
            }
            int temp = dataOfEmp[i];
            dataOfEmp[i] = dataOfEmp[min];
            dataOfEmp[min] = temp;
        }
        int f = 1;
        int k = 601;
        System.out.println("SNo         ID of Employees                      Report File");
        for(int s = 0; s < dataOfEmp.length; s++){
            System.out.println(f++ +"                  "+dataOfEmp[s]+"                                "+k++ +"Es");
        }
        return dataOfEmp;
    }

}
