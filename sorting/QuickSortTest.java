import java.util.Arrays;

class QuickSort {
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    /** Partition the array list[first..last] using the last element as pivot */
    private static int partition(int[] list, int first, int last) {
        int pivot = list[last]; // Use last element as pivot
        int low = first;
        int high = last - 1;

        while (low <= high) {
            // Move low forward while list[low] < pivot
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            // Move high backward while list[high] > pivot
            while (low <= high && list[high] > pivot) {
                high--;
            }

            // Swap if necessary
            if (low < high) {
                int temp = list[low];
                list[low] = list[high];
                list[high] = temp;
            }
        }

        // Place pivot in the correct position
        if (list[low] > pivot) {
            int temp = list[low];
            list[low] = list[last];
            list[last] = temp;
        }

        return low;
    }
}


public class QuickSortTest {
    public static void main(String[] args) {
        int[] list = {10, 5, 3, 8, 2, 7, 9, 6};

        System.out.println("Before sorting: " + Arrays.toString(list));
        QuickSort.quickSort(list);
        System.out.println("After sorting:  " + Arrays.toString(list));
    }
}

