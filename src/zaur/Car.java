package zaur;

public class Car {
    Car() {

    }
}

class CarTestOne {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("zzz " + car1.toString()); // << есть ссылка объекта нет
        Car car2 = new Car();

    }
}
