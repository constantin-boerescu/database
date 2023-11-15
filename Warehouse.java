public class Warehouse {
    // Invenotry atributes
    private int warehouseId;
    private String warehouseName;
    private Location warehouseLocation;

    // Constructor
    public Warehouse(int warehouseId, String warehouseName, Location warehouseLocation) {
        this.warehouseId = warehouseId;
        this.warehouseName = warehouseName;
        this.warehouseLocation = warehouseLocation;
    }

    // Getters and setters
    public int getWarehouseId() {
        return warehouseId;
    }
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }

    public String getWarehouseName() {
        return warehouseName;
    }
    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public Location getWarehouseLocation() {
        return warehouseLocation;
    }
    public void setWarehouseLocation(Location warehouseLocation) {
        this.warehouseLocation = warehouseLocation;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Werhouse: " + warehouseName + " from: " + warehouseLocation.getLocationAddress(); 
    }


}