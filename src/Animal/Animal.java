package Animal;

public class Animal {
	protected String name;
	protected int age;

	public Animal() {
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void say(){
		System.out.println("Its Animal!");
	}
}
