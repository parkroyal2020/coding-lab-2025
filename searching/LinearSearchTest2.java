//class Product {
//	private String name;
//	private double price;
//
//	// Constructor
//	public Product(String name, double price) {
//		this.name = name;
//		this.price = price;
//	}
//
//	// Getter methods
//	public String getName() {
//		return name;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//}
//
//class LinearSearch {
//
//	// Static method to perform linear search
//	public static int search(Product[] products, String targetName) {
//		for (int i = 0; i < products.length; i++) {
//			if (products[i].getName().equalsIgnoreCase(targetName)) {
//				return i; // found
//			}
//		}
//		return -1; // not found
//	}
//}
//
//public class LinearSearchTest2 {
//
//	public static void main(String[] args) {
//		// Create product instances
//		Product[] cars = { 
//				new Product("Telluride", 40000), 
//				new Product("Model Y", 45000), 
//				new Product("F-150", 37350),
//				new Product("XC90", 60000), 
//				new Product("Explorer", 52250) };
//
//		// Set the target product name
//		String target = "F-150";
//
//		// Perform linear search
//		int index = LinearSearch.search(cars, target);
//
//		// Print result
//		if (index != -1) {
//			Product found = cars[index];
//			System.out.println("Car found: " + found.getName() + " - $" + found.getPrice());
//		} else {
//			System.out.println("Car " + target + " not found.");
//		}
//	}
//}
