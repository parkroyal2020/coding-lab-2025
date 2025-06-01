import java.util.Arrays;

class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}

class BubbleSort {
	/** The method for sorting the numbers */
	public static void bubbleSort(Product[] list) {
		boolean needNextPass = true;

		for (int i = 1; i < list.length && needNextPass; i++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int j = 0; j < list.length - i; j++) {
				if (list[j].getPrice() > list[j + 1].getPrice()) {
					// Swap list[j] with list[j + 1]
					Product temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}
}

public class BubbleSortTest2 {
	public static void main(String[] args) {

		Product[] products = { new Product("Telluride", 40000), 
							   new Product("Model Y", 45000), 
							   new Product("F-150", 37350),
							   new Product("XC90", 60000), 
							   new Product("Explorer", 52250) };

		System.out.println("Before sorting:");
		printProducts(products);

		BubbleSort.bubbleSort(products);

		System.out.println("\nAfter sorting by price:");
		printProducts(products);
	}

	public static void printProducts(Product[] products) {
		for (Product p : products) {
			System.out.printf("%s - $%.2f\n", p.getName(), p.getPrice());
		}
	}
}