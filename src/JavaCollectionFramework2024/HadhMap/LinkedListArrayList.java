package JavaCollectionFramework2024.HadhMap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListArrayList {
	public static void main(String[] args) {
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();
		measureTime(linkedList, "linkedList");
		measureTime(arrayList, "arrayList");

	}

	static int item = 10_000;
	static int millisecond = 0;

	private static void measureTime(List<Integer> list, String string) {
		long start = System.currentTimeMillis();

		for (int i = 0; i < item; i++) {
			list.add(i);
		}

		long end = System.currentTimeMillis();

		System.out.println(end - start + " Добавление " + item + " элементов по времени в " + string + " и подсчет затраченного времени");

		System.out.println(" Считывание всего массива ");

		long startRead = System.currentTimeMillis();

		for (int i = 0; i < item; i++) {
			list.get(i);
		}

		long endRead = System.currentTimeMillis();

		System.out.println(endRead - startRead + " Считывание " + item + " элементов по времени в " + string + " и подсчет затраченного времени");
	}
}
