package zaur.Collection;

import java.util.ArrayList;

public class ArrayListMEthod3 {
	public static void main(String[] args) {

		ArrayList<String> arrayList1 = new ArrayList<>();
		arrayList1.add("Zaur");
		arrayList1.add("Ivan");
		arrayList1.add("Marya");
		System.out.println(arrayList1);
		ArrayList<String> arrayList2 = new ArrayList<>();
		arrayList2.add("!!!");
		arrayList2.add("Ivan");
		arrayList1.add("???");
		arrayList1.addAll(arrayList2);
		System.out.println(arrayList1);
		arrayList1.addAll( 1, arrayList2);
		System.out.println(arrayList1);
		System.out.println("поиск с начала массива " + arrayList1.indexOf("Ivan"));
		System.out.println("поиск с конца массива " + arrayList1.lastIndexOf("Ivan"));



		Student student1 = new Student("Ivan", 'm', 12, 1, 2.3);
		Student student2 = new Student("Nicola", 'm', 24, 5, 3.3);
		Student student3 = new Student("Elena", 'f', 16, 3, 4.3);
		Student student4 = new Student("Misha", 'm', 22, 4, 5.3);
		Student student5 = new Student("Maria", 'f', 18, 5, 8.3);

		ArrayList<Student> studentsArrayList = new ArrayList<>();
		studentsArrayList.add(student1);
		studentsArrayList.add(student2);
		studentsArrayList.add(student3);
		studentsArrayList.add(student4);
		studentsArrayList.add(student5);

		studentsArrayList.indexOf(student4);
		System.out.println("позиция в массиве объекта " + studentsArrayList.indexOf(student4));
		System.out.println("размер массива" + arrayList1.size());

		System.out.println("содержит ли объект " + arrayList1.contains("Maria"));

		System.out.println("пуст ли метод " + arrayList1.isEmpty());
		System.out.println(arrayList1);
		// очистка листа
		arrayList1.clear();

		System.out.println("пуст ли метод " + arrayList1.isEmpty());
		System.out.println(arrayList1);

	}



	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
