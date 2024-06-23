package HaroonMedicalStore_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.LinkedList;
import java.util.Scanner;
public class RecordOfMedicines {
    public static void DataGeneration(LinkedList<String> medicineData, LinkedList<Integer> priceData){
        Scanner input = new Scanner(System.in);
        System.out.println("Haroon Medical Store");
        System.out.print("Enter no of medicines:: ");
        int no = input.nextInt();
        for(int i = 0; i < no; i++){
            input.nextLine();
            System.out.print("Enter Medicine:: ");
            String medicine = input.nextLine();
            medicineData.add(medicine);
            System.out.print("Enter Price:: ");
            int price = input.nextInt();
            priceData.add(price);
        }
        System.out.println("SNo            Medicine                      Price");
        int f = 1;
        for(int j = 0; j < medicineData.size() && j < priceData.size(); j++){
            System.out.println(f++ +"                  "+medicineData.get(j)+"                  "+priceData.get(j));
        }
        input.nextLine();
        System.out.print("Medicine for deletion:: ");
        String delete_med = input.nextLine();
        medicineData.remove(delete_med);
        System.out.print("Price for deletion:: ");
        int delete_prc = input.nextInt();
        priceData.remove(Integer.valueOf(delete_prc));
        int s = 1;
        for(int j = 0; j < medicineData.size() && j < priceData.size(); j++){
            System.out.println(s++ +"                  "+medicineData.get(j)+"                  "+priceData.get(j));
        }
    }
}


