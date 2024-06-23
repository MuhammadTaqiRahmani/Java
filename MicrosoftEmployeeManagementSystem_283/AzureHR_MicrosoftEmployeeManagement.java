package MicrosoftEmployeeManagementSystem_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.Scanner;
public class AzureHR_MicrosoftEmployeeManagement {
    public static void main(String[] args) {
        int[] dataOfDirectors = new int[20];
        int[] dataOfEmployees = new int[20];

        System.out.println("AzureHR: Microsoft Employee Management");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Pin Code: ");
        int pin = input.nextInt();

        if(pin == 55640){
            System.out.println("1- Data of Directors(Ds) \n2- Data of Employees(Es)");
            System.out.print("Ds or Es? ");
            int privateSource = input.nextInt();

            if(privateSource == 1){
                int[] sortedData = RecordOfDirectors.recordOfDirectors(dataOfDirectors);
                System.out.println("");
                System.out.println("Sorted Data");
                System.out.println("");
                RecordOfDirectors.bubbleSorting(sortedData);
            }else if(privateSource == 2){
                RecordOfEmployees.recordOfEmployees(dataOfEmployees);
                System.out.print("No of Employees hired in Last Month: ");
                int hiredEmp = input.nextInt();
                int[] updatedDataOfEmployees = RecordOfEmployees.hired(dataOfEmployees, hiredEmp);
                System.out.println("");
                System.out.println("Updated Data");
                System.out.println("");
                int[] sequentialRecord = RecordOfEmployees.updateRecord(updatedDataOfEmployees,445,10);
                System.out.println("");
                System.out.println("Sorted Data");
                System.out.println("");
                RecordOfEmployees.selectionSort(sequentialRecord);
            }else{
                System.out.println("Unable to catch record");
            }

        }else{
            System.out.println("Threat!!!");
        }
    }
}
