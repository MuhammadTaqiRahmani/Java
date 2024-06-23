package Lab_10_Queue_Implementation_283;
//Muhammad Taqi Rahmani - BSE - 283 - 2022F - section F
import java.util.LinkedList;
import java.util.Queue;

public class GarageSimulation {
    public static void main(String[] args) {
        Queue<String> garageQueue = new LinkedList<>();
        int moves = 0;
        String[] inputLines = {"A GCD334", "A DEDF46", "D ABC233", "A GHI789", "D XEF456"};

        for (String inputLine : inputLines) {
            char action = inputLine.charAt(0);
            String licensePlate = inputLine.substring(2);

            if (action == 'A') {
                if (garageQueue.size() < 3) {
                    garageQueue.offer(licensePlate);
                    System.out.println("Car - license plate " + licensePlate + " arrived. Garage has room.");
                } else {
                    System.out.println("Car - license plate " + licensePlate + " arrived. No room in the garage. Car leaves.");
                }
            } else if (action == 'D') {
                int movesRequired = 0;
                while (!garageQueue.isEmpty() && !garageQueue.peek().equals(licensePlate)) {
                    String movedCar = garageQueue.poll();
                    movesRequired++;
                    System.out.println("Moved car with license plate " + movedCar + " to allow departure.");
                }

                if (!garageQueue.isEmpty()) {
                    garageQueue.poll();
                    System.out.println("Car - license plate " + licensePlate + " departed. Moves required: " + movesRequired);
                } else {
                    System.out.println("Car - license plate " + licensePlate + " is not in the garage. Departure failed.");
                }
            }
        }
    }
}
