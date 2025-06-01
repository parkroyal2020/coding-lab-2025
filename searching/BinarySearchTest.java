
class BinarySearch {

	// Binary search method (iterative)
	public static int binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;

			if (array[mid] == target) {
				return mid; // Found
			} else if (array[mid] < target) {
				left = mid + 1; // Search right half
			} else {
				right = mid - 1; // Search left half
			}
		}

		return -1; // Not found
	}
}

// Main class
public class BinarySearchTest {
	public static void main(String[] args) {
		int[] numbers = { 3, 5, 7, 9, 12, 14 }; // Must be sorted
		int target = 9;

		int result = BinarySearch.binarySearch(numbers, target);

		if (result != -1) {
			System.out.println("Target " + target + " found at index: " + result);
		} else {
			System.out.println("Target " + target + " not found in the array.");
		}
	}
}
