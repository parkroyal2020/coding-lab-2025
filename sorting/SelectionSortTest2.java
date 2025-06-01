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

class SelectionSort {
	public static void selectionSort(Product[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j].getPrice() < list[minIndex].getPrice()) {
					minIndex = j;
				}
			}

			// Swap if needed
			if (minIndex != i) {
				Product temp = list[i];
				list[i] = list[minIndex];
				list[minIndex] = temp;
			}
		}
	}
}

public class SelectionSortTest2 {
	public static void main(String[] args) {

		Product[] products = { 
				new Product("Laptop", 999.99), 
				new Product("Mouse", 19.99),
				new Product("Keyboard", 49.99), 
				new Product("Monitor", 199.99), 
				new Product("Headphones", 89.99) };

		System.out.println("Before sorting:");
		printProducts(products);

		SelectionSort.selectionSort(products);

		System.out.println("\nAfter sorting by price:");
		printProducts(products);
	}

	public static void printProducts(Product[] products) {
		for (Product p : products) {
			System.out.printf("%s - $%.2f\n", p.getName(), p.getPrice());
		}
	}
}