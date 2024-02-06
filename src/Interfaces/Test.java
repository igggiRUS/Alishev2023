package Interfaces;

public class Test {
	public static void main(String[] args) {
		Animal animal1 = new Animal(1);
		Person person1 = new Person("Миша");
//		если класс реализует интерфейс значит класс обязан иметь методы котрые этот интерфейс реализует
//		интерфейс это то что показывает какими методами владеет класс потому что в интерфейсе эти методы
//		animal1.sleep();
//		person1.sayHello();
		animal1.showInfo();
		person1.showInfo();
	}
}
