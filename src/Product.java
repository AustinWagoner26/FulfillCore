public class Product{
    private int productId;
    private String productName;
    private double price;
    private String category;
    
    //The Constructors
    public Product(int productId, String productName, double price, String category) {
        
        this.productId = productId;
        this.productName = productName;
        this.category = category;
        setPrice(price);

    }
    //The Getters
    public int getProductId(){
        return productId;
    }

    public String getProductName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

    public String getCategory(){
        return category;
    }

    //This section validates the price and if the user puts in a negative number, it will print "Price must be valid, non-negative number." 
    public void setPrice(double price) {
        if (!Double.isFinite(price) || price < 0) {
            System.out.println("Price must be valid, non-negative number.");
        }
        
        this.price = price;
    }
    
    //this will display the product information
    public void displayProduct(){
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.printf("Price: $%.2f%n", price);
        System.out.println("Category: " + category);
        System.out.println("-------------------------");
    }


}