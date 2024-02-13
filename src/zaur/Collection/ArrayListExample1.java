package zaur.Collection;

import java.util.ArrayList;

public class ArrayListExample1  {
	public static void main(String[] args) {
		ArrayList<String> arrayList1 = new ArrayList<String>();
		arrayList1.add("Zaur");
		arrayList1.add("Ivan");
		arrayList1.add("Marya");

		// создаем массив на 200 позиций
		ArrayList<String> arrayList2 = new ArrayList<>(200);
		ArrayList<String> arrayList3 = new ArrayList<>(arrayList1); // ссылается на arrayList1
		System.out.println(arrayList3);
		System.out.println(arrayList3 == arrayList1);


	}
}
