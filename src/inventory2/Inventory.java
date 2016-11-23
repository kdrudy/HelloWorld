package inventory2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kdrudy on 8/15/16.
 */
public class Inventory {

    public static void main(String args[]) throws Exception {
        ArrayList<InventoryItem> inventory = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do {
            for(int i = 0;i<inventory.size();i++) {
                InventoryItem item = inventory.get(i);
                System.out.printf("%d. [%d] %s : %s%n", i+1, item.quantity, item.name, item.category);
            }
            System.out.println("Options:");
            System.out.println("[1] Create new item");
            System.out.println("[2] Remove an item");
            System.out.println("[3] Update an item's quantity");

            String selection = scanner.nextLine();

            switch(selection) {
                case "1":
                    System.out.println("Enter name of new item:");
                    String newItemName = scanner.nextLine();
                    System.out.println("Enter category of new item:");
                    String newItemCategory = scanner.nextLine();
                    InventoryItem newItem = createItem(newItemName, 1, newItemCategory);
                    inventory.add(newItem);
                    break;
                case "2":
                    System.out.println("Enter number of item to remove:");
                    int itemNumber = Integer.parseInt(scanner.nextLine());
                    inventory.remove(itemNumber-1);
                    break;
                case "3":
                    System.out.println("Which item to update:");
                    int updateItemNumber = Integer.parseInt(scanner.nextLine());
                    InventoryItem item = inventory.get(updateItemNumber-1);
                    System.out.println("What is the new quantity?");
                    int newQuantity = Integer.parseInt(scanner.nextLine());
                    item.quantity = newQuantity;
                    break;
            }

        } while(true);

    }

    private static InventoryItem createItem(String name, int quantity, String category) throws Exception {

        switch(category.toLowerCase()) {
            case "hair":
                return new Hair(name, quantity);
            case "kneepad":
                return new Kneepad(name, quantity);
            case "pants":
                return new Pants(name, quantity);
            case "pinkiering":
            case "ring":
                return new PinkieRing(name, quantity);
            case "tattoo":
                return new Tattoo(name, quantity);
            default:
                throw new Exception("Invalid category");
        }
    }
}

