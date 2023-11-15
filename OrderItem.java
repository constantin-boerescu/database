public class OrderItem {
    // Order item atributes
    private int itemId;
    private Order order;
    private Product product;
    private int quantity;
    private float unitPrice;


    // Constructor for OrderItem
    public OrderItem(int itemId, Order order, Product product, int quantity, float unitPrice){
        this.itemId = itemId;
        this.order = order;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    // getters and setters
    public int getItemId(){
        return itemId;
    }
    public void setItemId(int itemId){
        this.itemId = itemId;
    }

    public Order getOrder(){
        return order;
    }
    public void setOrder(Order order){
        this.order = order;
    }

    public Product getProduct(){
        return product;
    }
    public void setProduct(Product product){
        this.product = product;
    }

    public int getQuantity(){
        return quantity;
    }
    public void setProduct(int quantity){
        this.quantity = quantity;
    }

    public float getUnitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(float unitPrice){
        this.unitPrice = unitPrice;
    }

    //Overritten the toString method
    @Override
    public String toString() {
        return "Item id: " + itemId + " product: " + product.getProductName() + " quantity " + quantity + " unit price " + unitPrice;
    }

}
