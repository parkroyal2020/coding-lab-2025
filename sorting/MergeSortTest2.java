import java.util.Arrays;

class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + ": $" + salary;
    }
}

class MergeSort {
    /** Sorts the array of employees by salary using merge sort */
    public static void mergeSort(Employee[] list) {
        if (list.length > 1) {
            // Split first half
            Employee[] firstHalf = new Employee[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            // Split second half
            int secondHalfLength = list.length - list.length / 2;
            Employee[] secondHalf = new Employee[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf);

            // Merge halves
            merge(firstHalf, secondHalf, list);
        }
    }

    /** Merges two sorted arrays into one */
    public static void merge(Employee[] list1, Employee[] list2, Employee[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1].getSalary() < list2[current2].getSalary()) {
                temp[current3++] = list1[current1++];
            } else {
                temp[current3++] = list2[current2++];
            }
        }

        while (current1 < list1.length)
            temp[current3++] = list1[current1++];

        while (current2 < list2.length)
            temp[current3++] = list2[current2++];
    }
}

public class MergeSortTest2 {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("Alice", 75000),
            new Employee("Bob", 50000),
            new Employee("Charlie", 62000),
            new Employee("Diana", 88000),
            new Employee("Eve", 47000)
        };

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(employees));

        MergeSort.mergeSort(employees);

        System.out.println("\nAfter sorting by salary:");
        System.out.println(Arrays.toString(employees));
    }
}
