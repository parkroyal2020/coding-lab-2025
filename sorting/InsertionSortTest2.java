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

class InsertionSort {
	public static void insertionSort(Product[] list) {
		for (int i = 1; i < list.length; i++) {
			Product currentElement = list[i];
			int j;
			for (j = i - 1; j >= 0 && list[j].getPrice() > currentElement.getPrice(); j--) {
				list[j + 1] = list[j];
			}
			list[j + 1] = currentElement;
		}
	}
}

public class InsertionSortTest2 {
	public static void main(String[] args) {

		Product[] products = { new Product("Telluride", 40000), 
							   new Product("Model Y", 45000), 
							   new Product("F-150", 37350),
							   new Product("XC90", 60000), 
							   new Product("Explorer", 52250) };

		System.out.println("Before sorting:");
		printProducts(products);

		InsertionSort.insertionSort(products);

		System.out.println("\nAfter sorting by price:");
		printProducts(products);
	}

	public static void printProducts(Product[] products) {
		for (Product p : products) {
			System.out.printf("%s - $%.2f\n", p.getName(), p.getPrice());
		}
	}
}