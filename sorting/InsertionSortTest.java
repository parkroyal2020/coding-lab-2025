import java.util.Arrays;

class InsertionSort {
	/** The method for sorting the numbers */
	public static void insertionSort(double[] list) {
		for (int i = 1; i < list.length; i++) {
			/**
			 * insert list[i] into a sorted sublist list[0..i-1] so that list[0..i] is
			 * sorted.
			 */
			double currentElement = list[i];
			int j;
			for (j = i - 1; j >= 0 && list[j] > currentElement; j--) {
				list[j + 1] = list[j];
			}

			// Insert the current element into list[j+1]
			list[j + 1] = currentElement;
		}
	}
}

public class InsertionSortTest {
	public static void main(String[] args) {

		double[] list1 = { 8, 5, 3, 10, 2 };
		System.out.println("Original list1: " + Arrays.toString(list1));
		InsertionSort.insertionSort(list1);
		System.out.println("Sorted list1:   " + Arrays.toString(list1));
	}
}
