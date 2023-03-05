package zaur;

public class Human {
    String name;
    Car3 car;
    BankAccount bA;
    void info () { // метод потому что есть void
        System.out.println("Имя: " + name + "color " + car.color + " Balance " + bA.balance);
    }
}

class HumanTest {
    public static void main(String[] args) {
        Human human = new Human();
        human.name = "Давид";
        human.car = new Car3("red", "w8");
        human.bA = new BankAccount(12, 43.43);
    }
}

//создали класс Car3 >>1
class Car3 { // это класс >> 2
    Car3(String cvet, String dvigatel) { // это конструктор внутри класса >> 4
//        Добавляем значения >>5
        color = cvet;
        engine = dvigatel;

    }
 
    // создаем атрибуты класса назвал так потому что не знаю как называются >> 3
    String color;
    String engine;

}
class BankAccount {
    BankAccount (int idBank, double myBalance) {
        id = idBank;
        balance = myBalance;
    }
    int id;
    double balance;
}
