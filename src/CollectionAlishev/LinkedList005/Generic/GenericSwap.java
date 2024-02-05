package CollectionAlishev.LinkedList005.Generic;


/**
 * 2.Создание метода с использованием Generics
 * Создайте метод swap, который будет менять местами два элемента в массиве любого типа.
 */

public class GenericSwap {

	public static <T> void swap(T[] array, int i, int j) {
		if (0 <= i && i < array.length && 0 <= j && j < array.length) {
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
		swap(intArray, 0, 4);
		System.out.println(java.util.Arrays.toString(intArray)); // Выведет: [5, 2, 3, 4, 1]

		// Пример использования с массивом строк
		String[] stringArray = {"Hello", "My", "Little", "Pony", "World"};
		swap(stringArray, 0, 4);
		System.out.println(java.util.Arrays.toString(stringArray)); // Выведет: [World, Hello]
	}
}