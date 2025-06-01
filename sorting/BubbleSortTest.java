import java.util.Arrays;

class BubbleSort {
	/** The method for sorting the numbers */
	public static void bubbleSort(double[] list) {
		boolean needNextPass = true;

		for (int i = 1; i < list.length && needNextPass; i++) {
			// Array may be sorted and next pass not needed
			needNextPass = false;
			for (int j = 0; j < list.length - i; j++) {
				if (list[j] > list[j + 1]) {
					// Swap list[j] with list[j + 1]
					double temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;

					needNextPass = true; // Next pass still needed
				}
			}
		}
	}
}

public class BubbleSortTest {
	public static void main(String[] args) {

		double[] list1 = { 8, 5, 3, 10, 2 };
		System.out.println("Original list1: " + Arrays.toString(list1));
		BubbleSort.bubbleSort(list1);
		System.out.println("Sorted list1:   " + Arrays.toString(list1));
	}
}
