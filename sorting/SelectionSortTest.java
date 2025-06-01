import java.util.Arrays;

class SelectionSort {
	/** The method for sorting the numbers */
	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) {
			// Find the minimum in the list[i..list.length-1]
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				if (list[j] < currentMin) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			// Swap list[i] with list[currentMinIndex] if needed
			if (currentMinIndex != i) {
				double temp = list[i];
				list[i] = list[currentMinIndex];
				list[currentMinIndex] = temp;
			}
		}
	}
}

public class SelectionSortTest {
	public static void main(String[] args) {

		double[] list1 = { 8, 5, 3, 10, 2 };
		System.out.println("Original list1: " + Arrays.toString(list1));
		SelectionSort.selectionSort(list1);
		System.out.println("Sorted list1:   " + Arrays.toString(list1));
	}
}
