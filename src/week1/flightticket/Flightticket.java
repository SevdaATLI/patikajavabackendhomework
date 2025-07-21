package week1.flightticket;

import java.util.Scanner;

public class Flightticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gather input from the user
        System.out.print("Enter the distance in KM: ");
        int distance = scanner.nextInt();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Select the travel type (1: One Way, 2: Round Trip): ");
        int travelType = scanner.nextInt();

        // Validate input values
        if (distance <= 0 || age <= 0 || (travelType != 1 && travelType != 2)) {
            System.out.println("Invalid input!");
            return;
        }

        // Unit price per KM
        double pricePerKm = 0.10;

        // Calculate total price
        double totalPrice = distance * pricePerKm;

        // Apply discounts based on age
        if (age < 12) {
            totalPrice *= 0.50; // 50% discount
        } else if (age <= 24) {
            totalPrice *= 0.90; // 10% discount
        } else if (age > 65) {
            totalPrice *= 0.70; // 30% discount
        }

        // Apply discount for round trip
        if (travelType == 2) {
            totalPrice *= 0.80; // 20% discount
        }

        System.out.printf("Your ticket price is: %.2f TL\n", totalPrice);
    }
}