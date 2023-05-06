package Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ProductRead{
    private ArrayList<Product> products;

    private String csvFilePath = "products.csv";

    public ProductRead() {
        this.products = new ArrayList<Product>();


    }



    private void loadProductsFromCsv() {
        try {
            FileReader reader = new FileReader(csvFilePath);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
              
                StringTokenizer tokens = new StringTokenizer(line, ",");
                String name = tokens.nextToken();
                double price = Double.parseDouble(tokens.nextToken());
                String description = tokens.nextToken();
                Product p = new Product(name, price, description);
                products.add(p);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error loading products from CSV file!");
        }
    }

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter product description: ");
        String description = sc.nextLine();

        Product product = new Product(name, price, description);
//        products.add(product);

        try {
            FileWriter writer = new FileWriter(csvFilePath, true);
            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println(product.toString());
            printWriter.close();
        } catch (IOException e) {
            System.out.println("Error adding product to CSV file!");
        }

        System.out.println("Product added successfully!");
    }

    public void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name to delete: ");
        String name = sc.nextLine();

        for (Product product : products) {
            if (product.getName().equals(name)) {
                products.remove(product);

                try {
                    FileWriter writer = new FileWriter(csvFilePath);
                    PrintWriter printWriter = new PrintWriter(writer);
                    for (Product p : products) {
                        printWriter.println(p.getName() + "," +
                                p.getPrice() + "," +
                                p.getDecription());
                    }
                    printWriter.close();
                } catch (IOException e) {
                    System.out.println("Error deleting product from CSV file!");
                }

                System.out.println("Product deleted successfully!");
                return;
            }
        }

        System.out.println("Product not found!");
    }

    public void viewProducts() {
        products  = new ArrayList<>();
        loadProductsFromCsv();
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }

    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product name to search: ");
        String name = sc.nextLine();
        loadProductsFromCsv();

        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
                return;
            }
        }

        System.out.println("Product not found!");
    }
    public Product searchProduct(String name) {

        loadProductsFromCsv();

        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
                return product;
            }
        }

        return null;
    }
}
