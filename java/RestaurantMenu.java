import java.util.Scanner;

public class RestaurantMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=====Restaurant Menu=====");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Coffee");
        System.out.println("=========================");

        System.out.print("Enter your choice(1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You have selected Pizza");
                System.out.println("\n---Pizza Menu---");
                System.out.println("1. Small - Rs. 150");
                System.out.println("2. Medium - Rs. 250");
                System.out.println("3. Large - Rs. 350");
                break;

            case 2:
                System.out.println("You have selected Burger");
                System.out.println("\n---Burger Menu---");
                System.out.println("1. Veg Burger - Rs. 80");
                System.out.println("2. Chicken Burger - Rs. 120");
                break;

            case 3:
                System.out.println("You have selected Coffee");
                System.out.println("\n---Coffee Menu---");
                System.out.println("1. Espresso - Rs. 60");
                System.out.println("2. Cappuccino - Rs. 100");
                System.out.println("3. Latte - Rs. 120");
                break;

            default:
                System.out.println("Invalid choice! Please select between 1 and 3.");
                break;
        }

        sc.close();
    }
}