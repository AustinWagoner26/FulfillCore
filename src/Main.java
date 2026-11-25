import java.util.Scanner;
public class Main{
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        

        System.out.println("================================");
        System.out.println("          FULFILLCORE VO.1");
        System.out.println("================================");
        
        System.out.println("1. Add Product");
        System.out.println("2. View All Products");
        System.out.println("3. Search Product");
        System.out.println("4. Update Product");
        System.out.println("5. Remove Product");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        
        switch(choice){
            case 1:
                System.out.print("Enter product ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter product name: ");
                String name = scanner.nextLine();

                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Enter product category: ");
                String category = scanner.nextLine();

                Product newProduct = new Product(id, name, price, category);

                manager.addProduct(newProduct);

                System.out.println("Product successfully added!");
                break;
            
            case 2:
                manager.displayAllProducts();
                break;
            
            case 3:
                System.out.println("Searching product...");
                break;

            case 4:
                System.out.println("Updating product...");
                break;
            
            case 5:
                System.out.println("Removing product...");
                break;

            case 6:
                System.out.println("Exiting Fulfillcore...");
                break;

            default:
                System.out.println("Invalid choice.");
                break; 
        }

        
        manager.displayAllProducts();

        scanner.close();
    }
}