package CollectionAlishev.LinkedList005.Generic;

/**
 * 1. Создание класса с использованием Generics
 * Создайте класс Box, который может хранить любой тип объекта.
 *
 */

public class GenericBox<T> {
	private T t;

	public void  set(T t) {
		this.t = t;
	}
	public T get(){
		return t;
	}

	public static void main(String[] args) {
		// get возвращает строку set устанавливает значение строки
		GenericBox<Integer> integerGenericBoxBox = new GenericBox<>();
		integerGenericBoxBox.set(10);
		Integer someInteger = integerGenericBoxBox.get();

		GenericBox<String> stringGenericBoxBox = new GenericBox<>();
		stringGenericBoxBox.set("Hello World");
		String someString = stringGenericBoxBox.get();

		GenericBox<Double> doubleGenericBoxBox = new GenericBox<>();
		doubleGenericBoxBox.set(12.5d);
		Double someDouble = doubleGenericBoxBox.get();

		System.out.println(someString);
		System.out.println(someInteger);
		System.out.println(someDouble);
	}

}
