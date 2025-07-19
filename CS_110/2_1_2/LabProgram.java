
import java.util.Scanner;

public class LabProgram {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        // Read the three operations: purchase, restock, purchase
        int firstPurchase = scnr.nextInt();
        int restockAmount = scnr.nextInt();
        int secondPurchase = scnr.nextInt();

        // Create the vending machine and perform transactions
        VendingMachine vm = new VendingMachine();
        vm.purchase(firstPurchase);
        vm.restock(restockAmount);
        vm.purchase(secondPurchase);

        // Report remaining inventory
        vm.report();
    }
}
