package zaur;
//TODO: class constructor attribute
public class App03ClassConstructorAttr {
    public static void main(String[] args) {

        Car4 car4 = new Car4("c", 4); // создание нового объекта
        System.out.println("категория машины " + car4.carType);
        System.out.println("колличество дверей " + car4.door);

    }
}

class Car4 { // создание класса
    Car4(String carType, int door) { // создание конструктора

    //            carType = "B";   // можно указать default
    //            door = 4; // можно указать default

    }

    String carType; // атрибуты конструктора
    int door; // атрибуты конструктора
}
