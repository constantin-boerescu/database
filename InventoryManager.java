import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Inventory> inventoriesList = new ArrayList<>();

    // Add a inventory to list
    public void addInventory(Inventory inventory) {
        if (!inventoriesList.contains(inventory)){
            inventoriesList.add(inventory);
            System.out.println("Inventory " + inventory.getInvenotryId() + " was added");
        }
    }
    // Remove a inventory from list
    public void removeInventory(Inventory inventory) {
        if (inventoriesList.contains(inventory)){
            inventoriesList.add(inventory);
            System.out.println("Inventory " + inventory.getInvenotryId() + " was removed");
        }
    }
    // Show all inventories
    public void printInventories(){
        for (Inventory inventory : inventoriesList){
            System.out.println(inventory.getInvenotryId());
        }
    }
    
}
