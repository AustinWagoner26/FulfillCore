import java.util.ArrayList;

public class ProductManager {
    //This section creates a collection of products
    private ArrayList<Product> products = new ArrayList<>();
    
    //This section adds new products to the collectio
    public void addProduct(Product product){
        product.add(product);
    }

    //This will display all of the products
    public void displayAllProducts(){
        for (Product product : products) {
            product.displayProduct();
        }
    }
}