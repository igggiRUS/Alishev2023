package Interfaces;

public class Test2 {
	public static void main(String[] args) {
		Info info1 = new Animal(1);
		Info info2 = new Person("bob");
		Animal animal1 = new Animal(2);
		Person person1 = new Person("Helen");
//		ограничили класс реализацией интерфейса
		// интерфейс используется для того что бы мы были уверенны что у класса есть определенные методы
		info1.showInfo();
		info2.showInfo();
		outputInfo(info1);
		outputInfo(info2);
		outputInfo(animal1); // эти классы можно так записать потому что они реализовали интерфейс Info
		outputInfo(person1); // эти классы можно так записать потому что они реализовали интерфейс Info
	}
	public static void outputInfo(Info info){

	}
}
