package zaur.Collection;

import java.util.Objects;

public class Student {

	private String name;
	private char sex;
	private int age;
	private int course;
	private double avgGrade;

	public Student(String name, char sex, int age, int course, double avgGrade) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.course = course;
		this.avgGrade = avgGrade;
	}

	public String toString() {
		return "Students{ " +
				"name = " + name +
				", sex = " + sex +
				", age =  " + age +
				", cource = " + course +
				", avgGrade = " + avgGrade +
				" }";
	}
	// переопределение метода


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return sex == student.sex &&
				age == student.age &&
				course == student.course &&
				Double.compare(avgGrade, student.avgGrade) == 0 &&
				Objects.equals(name, student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sex, age, course, avgGrade);
	}
}
