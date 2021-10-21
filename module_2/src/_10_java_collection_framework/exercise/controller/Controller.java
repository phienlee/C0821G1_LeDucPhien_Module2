package _10_java_collection_framework.exercise.controller;
import _10_java_collection_framework.exercise.models.Product;
import _10_java_collection_framework.exercise.sevices.ProductServiceImpl;
import java.util.Scanner;

public class Controller {
    private ProductServiceImpl productService = new ProductServiceImpl();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.displayMenu();
    }

    public void displayMenu() {
        System.out.println("---------------------------------");
        System.out.println("Main menu\n" +
                "1. Add new product\n" +
                "2. Show list product\n" +
                "3. Search product by name\n" +
                "4. Edit product by id\n" +
                "5. Delete product by id\n" +
                "0. Exit");
        System.out.println("---------------------------------");
        int choice;
        do {
            choice = getChoice();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    showProductList();
                    break;
                case 3:
                    searchProductByName();
                    break;
                case 4:
                    editProductById();
                    break;
                case 5:
                    deleteProductById();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please try again");
            }
        } while (true);

    }

    public void addProduct() {
        System.out.println("Enter id new product");
        String idProduct = scanner.nextLine();
        System.out.println("Enter name new product");
        String productName = scanner.nextLine();
        System.out.println("Enter stock new product");
        String stock = scanner.nextLine();
        System.out.println("Enter price new product");
        String price = scanner.nextLine();
        Product product = new Product(Integer.parseInt(idProduct), productName, Integer.parseInt(stock), Integer.parseInt(price));
        productService.addProduct(product);
        showProductList();
    }

    private void deleteProductById() {
        System.out.println("Enter id product to delete");
        int idProduct = scanner.nextInt();
        System.out.println("Do you want to delete?\n" +
                "1. Delete\n" +
                "2. Back to main menu");
        int flag = scanner.nextInt();
        switch (flag){
            case 1:
                productService.deleteProduct(idProduct);
                System.out.println("Deleted Successfully");
                showProductList();
                break;
            case 2:
                displayMenu();
                break;
            default:
                System.out.println("Please enter 1 or 2");
        }

    }

    private void editProductById() {
        System.out.println("Enter id product to edit");
        int idProduct = scanner.nextInt();
        Product product = productService.findByIdProduct(idProduct);
        if (product != null){
            scanner.nextLine();
            System.out.println("Enter new name product");
            String nameProduct = scanner.nextLine();
            System.out.println("Enter new stock product");
            int stock = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter new price product");
            int price = Integer.parseInt(scanner.nextLine());
            product.setNameProduct(nameProduct);
            product.setStock(stock);
            product.setPrice(price);
            showProductList();
        }else{
            System.out.println("Not available");
        }
    }

    private void searchProductByName() {
        System.out.println("Enter name product to search");
        String nameProduct = scanner.nextLine();
        Product product = productService.findProduct(nameProduct);
        System.out.println(product);
    }

    private void showProductList() {
        for (Product product : productService.getProductList()
        ) {
            System.out.println(product);
        }
    }

    public int getChoice() {
        int choice;
        while (true) {
            try {
                System.out.println("Enter your choice");
                choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number");
            }
        }
        return choice;
    }
}
