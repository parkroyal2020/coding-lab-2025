import java.util.Arrays;
import java.util.Comparator;

class Product {
    private String name;
    private double price;

    // Constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class BinarySearch {

    // Binary search method to search by product name
    public static int search(Product[] products, String targetName) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int comparison = products[mid].getName().compareToIgnoreCase(targetName);

            if (comparison == 0) {
                return mid; // Found
            } else if (comparison < 0) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Not found
    }
}

public class BinarySearchTest2 {

    public static void main(String[] args) {
        // Create product instances (unsorted initially)
        Product[] cars = {
            new Product("Telluride", 40000),
            new Product("Model Y", 45000),
            new Product("F-150", 37350),
            new Product("XC90", 60000),
            new Product("Explorer", 52250)
        };

        // Sort products by name (binary search requires sorted array)
        Arrays.sort(cars, Comparator.comparing(Product::getName, String.CASE_INSENSITIVE_ORDER));

        // Set the target product name
        String target = "F-150";

        // Perform binary search
        int index = BinarySearch.search(cars, target);

        // Print result
        if (index != -1) {
            Product found = cars[index];
            System.out.println("Car found: " + found.getName() + " - $" + found.getPrice());
        } else {
            System.out.println("Car " + target + " not found.");
        }
    }
}
