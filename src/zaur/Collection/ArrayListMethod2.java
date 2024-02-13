package zaur.Collection;

import java.util.ArrayList;
import java.util.Objects;

public class ArrayListMethod2 {
	public static void main(String[] args) {

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
		System.out.println();
		System.out.println();
		System.out.println(studentsArrayList);
		System.out.println("insert new student");
		Student student6 = new Student("Maria", 'f', 18, 5, 8.3);
		System.out.println();
		System.out.println("studentsArrayList.remove(student6)");
		studentsArrayList.remove(student6); // сравнивает объект по методу equals и удаляет его student6 не был удален
		System.out.println("student6 не был удален сравнение идет через метод equals");
		System.out.println(studentsArrayList);
	}
}






