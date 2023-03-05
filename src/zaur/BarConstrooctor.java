package zaur;

public class BarConstrooctor { // конструктор
    String color = "red";
    String engine = "W6";
}
class Tar { // конструткор пустой
    String col;
    String eng;

}
class BarTest{
    public static void main(String[] args) {
        int a;
        BarConstrooctor barConstrooctor1 = new BarConstrooctor(); // создается объект
        Tar tar = new Tar(); // создается объект пустой
        System.out.println(barConstrooctor1.color);
        System.out.println(barConstrooctor1.engine);
        barConstrooctor1.color = "blck";
        barConstrooctor1.engine ="w8";
        System.out.println(barConstrooctor1.color);
        System.out.println(barConstrooctor1.engine);
        tar.col = "пустой цвет";
        tar.eng ="пустой двигатель";
        System.out.println(tar.col);
        System.out.println(tar.eng);

    }
}