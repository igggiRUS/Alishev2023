package JavaCollectionFramework2024.ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {

//обычный массив
		int[] x = new int[3];

		for (int i = 0; i < 3; i++) {         //  нельзя выходить за длинну массива
			x[i] = 1;                         // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		}
		System.out.println(Arrays.toString(x));
//ArrayList
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int j = 0; j < 6; j++) {
			arrayList.add(j);
		}
		System.out.println(arrayList);
		System.out.println("вызов по индексу : " + arrayList.get(0));
		System.out.println("вызов по индексу : " + arrayList.get(3));
		System.out.println("размер листа : " + arrayList.size());

		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println("for " + arrayList.get(i));

		}
		for (Integer element :
				arrayList) {
			System.out.println("for each " + element);
		}
//		есть способ вывести с помощью лямбда функций

		arrayList.remove(4); // удаление по индексу
		System.out.println("удаление по индексу " + arrayList);

//				создаем лист но по задаче надо много удалять из листа
		List<Integer> list = new ArrayList<>(); // создан лист

//					тут должно пройти много операций по удалению

		list = new LinkedList<>(); // берем переменную и ссылаем ее на объект LinkedList()
		// после переносим все элементы из ArrayList в LinkedList и можем эффективно удалять ненужные индексы
	}

}


