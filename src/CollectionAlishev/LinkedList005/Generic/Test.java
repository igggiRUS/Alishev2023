package CollectionAlishev.LinkedList005.Generic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arrayList.add(i);
		}
		System.out.println(arrayList);
		System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(arrayList.size() - 1));
		System.out.println(arrayList.size());

		for (Integer i : arrayList
		) {
			System.out.print(i + ", ");
		}
		System.out.println();
		arrayList.remove(5);
		System.out.println(arrayList);

	}
}

