package whiteBunny.lesson15;

public class ConstructorFlower {
    public void foo() { //method
        Flower flower = new Flower();
        flower.name = "Ромашка";
        flower.color = "белая";

        Flower flower1 = new Flower("Роза", "Розовая");
        Flower flower2 = new Flower("Тюльпан", "желтый");
        System.out.println(flower1.color);
        System.out.println(flower1.name);
        System.out.println(flower.color);
        System.out.println(flower.name);
        System.out.println(flower2.color);
        System.out.println(flower2.name);
    }
}
