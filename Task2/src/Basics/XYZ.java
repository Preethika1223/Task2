package Basics;

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

public class XYZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        // Accept product information from the user
        for (int i = 0; i < products.length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Enter PID: ");
            int pid = scanner.nextInt();
            System.out.print("Enter price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();
            products[i] = new Product(pid, price, quantity);
        }

        // Find PID of the product with the highest price
        int highestPricePid = getHighestPricePid(products);
        System.out.println("PID of product with highest price: " + highestPricePid);

        // Calculate total amount spent on all products
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products: " + totalAmountSpent);

        scanner.close();
    }

    // Method to find PID of the product with the highest price
    static int getHighestPricePid(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int pid = -1;
        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                pid = product.pid;
            }
        }
        return pid;
    }

    // Method to calculate total amount spent on all products
    static double calculateTotalAmountSpent(Product[] products) {
        double totalAmount = 0;
        for (Product product : products) {
            totalAmount += product.price * product.quantity;
        }
        return totalAmount;
    }
}
/*Enter details for product 1:
Enter PID: 1
Enter price: 200
Enter quantity: 3
Enter details for product 2:
Enter PID: 2
Enter price: 500
Enter quantity: 50
Enter details for product 3:
Enter PID: 3
Enter price: 450
Enter quantity: 6
Enter details for product 4:
Enter PID: 4
Enter price: 700
Enter quantity: 7
Enter details for product 5:
Enter PID: 5
Enter price: 900
Enter quantity: 2
PID of product with highest price: 5
Total amount spent on all products: 35000.0
*/