package zaur.temp;

public class OverrideVsOVerload {

	private static class Parent {

		void method1() {
		}

	}

	private static class Child extends Parent { // дочерний класс наследуется от Parent
		// cигнатуры НЕ отличаются от Parent
//		void method1(){ // метод1 из класса Child ПЕРЕОПРЕДЕЛЯЕТ метод1 из класса Parent
		// cигнатуры отличаются от Parent
		void method1(int value) { //method1 из класса Child ПЕРЕГРУЖАЕТ метод1 из класса Parent
		}


	}

	public static void main(String[] args) {
		Child child = new Child();
		child.method1(); //если метод переопределен то вызывать метод из родительского класса не возможно
		child.method1(12); //если метод перегружен то уже будет 2 метода в классе Child
		// Перегрузка метода расширяет функциональность класса
	}
}
