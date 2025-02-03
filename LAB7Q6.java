package lab7q6;

import java.io.*;
import java.util.*;

class Product {
    String productID;
    String productName;
    double productPrice;

    public Product(String productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public double getTotalPrice(int quantity) {
        return productPrice * quantity;
    }
}

class Generator {
    static final String PRODUCT_FILE = "products.txt"; // Path to product file
    static final String ORDER_FILE = "orders.txt"; // Path to order file
}

public class LAB7Q6 {

    public static void main(String[] args) {
        HashMap<String, Product> productList = new HashMap<>();

        try (BufferedReader productReader = new BufferedReader(new FileReader(Generator.PRODUCT_FILE));
             BufferedReader orderReader = new BufferedReader(new FileReader(Generator.ORDER_FILE))) {

            // Read product file
            String line;
            while ((line = productReader.readLine()) != null) {
                String[] info = line.split(",");
                if (info.length == 3) {
                    productList.put(info[0].trim(), new Product(
                        info[0].trim(),
                        info[1].trim(),
                        Double.parseDouble(info[2].trim())
                    ));
                }
            }

            // Print order details
            System.out.printf(" %-15s%-25s%-10s%15s%15s\n",
                    "ProductID", "ProductName", "Quantity", "PricePerUnit", "Total");

            while ((line = orderReader.readLine()) != null) {
                String[] info = line.split(",");
                if (info.length == 3) {
                    String productID = info[0].trim();
                    int quantity = Integer.parseInt(info[2].trim());
                    Product product = productList.get(productID);

                    if (product != null) {
                        System.out.printf(" %-15s%-25s%-10d%15.2f%15.2f\n",
                                product.productID, product.productName, quantity,
                                product.productPrice, product.getTotalPrice(quantity));
                    } else {
                        System.out.printf(" %-15s%-25s%-10s%15s%15s\n",
                                productID, "Unknown Product", quantity, 0.0, 0.0);
                    }
                }
            }

        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }
    }
}
