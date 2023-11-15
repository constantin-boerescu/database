import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> productsList = new ArrayList<>();

    // Add a product to list
    public void addProduct(Product product) {
        if (!productsList.contains(product)){
            productsList.add(product);
            System.out.println("Product " + product.getProductName() + " was added");
        }
    }
    // Remove a product from list
    public void removeProduct(Product product) {
        if (productsList.contains(product)){
            productsList.add(product);
            System.out.println("Product " + product.getProductName() + " was removed");
        }
    }
    // Show all products
    public void printProducts(){
        for (Product product : productsList){
            System.out.println(product.getProductName());
        }
    }
}
