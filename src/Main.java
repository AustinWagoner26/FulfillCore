
public class Main{

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("          FULFILLCORE VO.1");
        System.out.println("================================");

        Product product1 = new Product(
            1001, "Gaming Keyboard", 79.99, "Electronics"
        );

        Product product2 = new Product(
            1002, "Gaming Mouse", 49.99, "Electronics"
        );

        Product product3 = new Product(
            1003, "Gaming Monitor", 199.99, "Electronics"
        );

        Product product4 = new Product(
            1004, "Gaming Headset", 59.99, "Electronics"
        );

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
        product4.displayProduct();

    }
}