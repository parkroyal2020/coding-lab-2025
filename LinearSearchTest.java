class LinearSearch {

	// Linear search method
	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i; // Target found, return index
			}
		}
		return -1; // Target not found
	}
}

public class LinearSearchTest {
	// Main method to test the search
	public static void main(String[] args) {
		int[] numbers = { 5, 12, 7, 3, 9, 14 };
		int target = 9;

		int result = LinearSearch.linearSearch(numbers, target);

		if (result != -1) {
			System.out.println("Target " + target + " found at index: " + result);
		} else {
			System.out.println("Target " + target + " not found in the array.");
		}
	}
}

