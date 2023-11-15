public class Inventory {
    // Inventory attributes
    private int invenotryId;
    private Product product;
    private Warehouse warehouse;
    private int quantity;

    // Constructor
    public Inventory(int invenotryId, Product product, Warehouse warehouse, int quantity) {
        this.invenotryId = invenotryId;
        this.product = product;
        this.warehouse = warehouse;
        this.quantity = quantity;
    }

    // Getters and setters
    public int getInvenotryId() {
        return invenotryId;
    }
    public void setInvenotryId(int invenotryId) {
        this.invenotryId = invenotryId;
    }

    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
