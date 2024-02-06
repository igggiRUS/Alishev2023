package CollectionAlishev.LinkedList005.Generic;

public class GeneircIntSwap {


	public static <T> void swap(T[] array, int i, int j) {
		if (i >= 0 && i < array.length && j >= 0 && j < array.length) {
			T temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		} else {
			throw new IndexOutOfBoundsException("Index out of bounds for the array");
		}
	}

	public static void main(String[] args) {
		// Пример использования с массивом целых чисел
		Integer[] intArray = {1, 2, 3, 4, 5};
		int end = intArray.length - 1;
		swap(intArray, 0, end);
		System.out.println(java.util.Arrays.toString(intArray)); // Выведет: [5, 2, 3, 4, 1]
	}
}
