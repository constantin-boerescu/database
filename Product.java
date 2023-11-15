public class Product {
    // Product atributes
    private int productId;
    private String productName;
    private String productDescription;
    private float standardCost;
    private float listPrice;
    private String category;

    // Constructor
    public Product(int productId, String productName, String productDescription, float standardCost, float listPrice, String category) {
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.standardCost = standardCost;
        this.listPrice = listPrice;
        this.category = category;
    }

    // Getters and setters
    public int getProductId(){
        return productId;
    }
    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getProductName(){
        return productName;
    }
    public void setProductName(String productName){
       this.productName = productName;
    }

    public String getProductDescription(){
        return productDescription;
    }
    public void setProductDescription(String productDescription){
       this.productDescription = productDescription;
    }

    public float getStandardCost(){
        return standardCost;
    }
    public void setStandardCost(float standardCost){
       this.standardCost = standardCost;
    }

    public float getlistPrice(){
        return listPrice;
    }
    public void setlistPrice(float listPrice){
       this.listPrice = listPrice;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
       this.category = category;
    }



}
