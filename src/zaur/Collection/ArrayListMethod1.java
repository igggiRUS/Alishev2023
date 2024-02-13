package zaur.Collection;

import java.util.ArrayList;

public class ArrayListMethod1 {
	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Zaur");
		arrayList1.add("Ivan");
		arrayList1.add("Marya");
		arrayList1.add(1, "Misha");
		System.out.println(arrayList1.get(0));
		System.out.println(arrayList1.get(1));
		System.out.println(arrayList1.get(2));
		System.out.println(arrayList1.get(3));

		System.out.println("loop -------");
		for (int i = 0; i < arrayList1.size(); i++) {
			System.out.println(arrayList1.size());
		}
		System.out.println("arrayList1.set(1, \"Masha\")");
		arrayList1.set(1, "Masha");

		System.out.println();
		System.out.println("Loop foreach ------------");

		for (String string :
				arrayList1) {
			System.out.println(string + " ");
		}
		System.out.println("-------------");
		System.out.println("loop for index");
		System.out.println("arrayList1.get(i)");
		for (int i = 0; i < arrayList1.size(); i++) {
			System.out.println(arrayList1.get(i)); // вывсти по индексу
		}

		System.out.println("-------------");
		System.out.println("remove for index");
		System.out.println("arrayList1.remove(0)");
		arrayList1.remove(0);
		showTheAnswer.arrayListMethod(arrayList1);
	}
 }