package HaroonMedicalStore_283;

import java.util.LinkedList;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
public class PharmaceuticalManagementSystem {
    public static void main(String[] args) {
        LinkedList<String> medicine = new LinkedList<String>();
        LinkedList<Integer> price = new LinkedList<Integer>();
        RecordOfMedicines.DataGeneration(medicine,price);
    }
}
