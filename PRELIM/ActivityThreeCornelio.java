import java.util.Scanner;

public class ActivityThreeCornelio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalPeso = 0;
        double priceConversion = 56;
        int quantTotal = 0;

        System.out.println("Menu:\n 1. C1 = Php 100.00\n 2. C2 = Php 150.00\n 3. C3 = Php 200.00");
        System.out.println("Add ons:\n 4. R1 = Php 35.00\n 5. R2 = Php 50.00");
        System.out.println(" ");
 
        while (true) {
            System.out.print("Enter item number (1-5) or 0 to exit: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break; 
            } else if (choice >= 1 && choice <= 5) {
                double price;
                String orderCode;

                switch (choice) {
                    case 1:
                        price = 100.00;
                        orderCode = "C1";
                        break;
                    case 2:
                        price = 150.00;
                        orderCode = "C2";
                        break;
                    case 3:
                        price = 200.00;
                        orderCode = "C3";
                        break;
                    case 4:
                        price = 35.00;
                        orderCode = "R1";
                        break;
                    case 5:
                        price = 50.00;
                        orderCode = "R2";
                        break;
                    default:
                        price = 0.00;
                        orderCode = "Invalid choice";
                }

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                double itemTotal = price * quantity;
                quantTotal += quantity;
                totalPeso += itemTotal;
                System.out.println("Item: " + orderCode + " x " + quantity + " = Php " + itemTotal);
            } else {
                System.out.println("Invalid choice. Please enter a number between 0 and 5.");
            }
        }
        System.out.println(" ");
        System.out.println("Your Order:");
        System.out.println("Total Quantity: " + quantTotal);
        System.out.println("Total in PHP: Php " + totalPeso);
        double totalDollars = totalPeso / priceConversion;
        System.out.printf("Total in USD: $ %.2f " , totalDollars);

        scanner.close();
    }
}