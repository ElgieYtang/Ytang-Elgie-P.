import java.util.Scanner;

public class ActivityThreeYtang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c1 = 100.0;
        double c2 = 150.0;
        double c3 = 200.0;
        double r1 = 35.0;
        double r2 = 50.0;

        System.out.println("Menu:");
        System.out.println("1. C1 = Php " + c1);
        System.out.println("2. C2 = Php " + c2);
        System.out.println("3. C3 = Php " + c3);

        System.out.println("Add ons:");
        System.out.println("4. R1 = Php " + r1);
        System.out.println("5. R2 = Php " + r2);

        System.out.print("Enter your order (1-3): ");
        int choice = scan.nextInt();

        if (choice < 1 || choice > 3) {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.print("Enter quantity for main item: ");
        int qty = scan.nextInt();

        System.out.print("Enter add ons (4-5 for add ons, 0 for none): ");
        int addOnChoice = scan.nextInt();
        int addOnQty = 0;

        if (addOnChoice != 0) {
            System.out.print("Enter quantity for add ons: ");
            addOnQty = scan.nextInt();
        }

        String mainItem = "";
        double itemCost = 0.0;

        switch (choice) {
            case 1:
                mainItem = "C1";
                itemCost = c1;
                break;
            case 2:
                mainItem = "C2";
                itemCost = c2;
                break;
            case 3:
                mainItem = "C3";
                itemCost = c3;
                break;
        }

        String addOnItem = "";
        double addOnCost = 0.0;

        if (addOnChoice == 4) {
            addOnItem = "R1";
            addOnCost = r1;
        } else if (addOnChoice == 5) {
            addOnItem = "R2";
            addOnCost = r2;
        }

        double totalCost = (itemCost * qty) + (addOnCost * addOnQty);
        double dollarConversion = totalCost / 56.0;

        System.out.println("\nOrder Details:");
        System.out.println("Main Item: " + mainItem);
        System.out.println("Quantity for Main Item: " + qty);
        System.out.println("Add Ons: " + addOnItem);
        System.out.println("Quantity for Add Ons: " + addOnQty);
        System.out.println("Total Cost: Php " + totalCost);
        System.out.println("Total Cost in USD is " + String.format("%.2f" ,dollarConversion));
    }
}
