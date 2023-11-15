import java.util.ArrayList;
import java.util.List;

public class WarehouseManager {
    private List<Warehouse> warehousesList = new ArrayList<>();

    // Add a warehouse to list
    public void addWarehouse(Warehouse warehouse) {
        if (!warehousesList.contains(warehouse)){
            warehousesList.add(warehouse);
            System.out.println("Warehouse " + warehouse.getWarehouseName() + " was added");
        }
    }
    // Remove a warehouse from list
    public void removeWarehouse(Warehouse warehouse) {
        if (warehousesList.contains(warehouse)){
            warehousesList.add(warehouse);
            System.out.println("Warehouse " + warehouse.getWarehouseName() + " was removed");
        }
    }
    // Show all warehouses
    public void printWarehouses(){
        for (Warehouse warehouse : warehousesList){
            System.out.println(warehouse.getWarehouseName());
        }
    }
    
}
