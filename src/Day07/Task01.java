package Day07;

/**
 * В классе Самолет создать статический метод, который в качестве аргументов принимает два объекта (два самолета)
 * и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */
public class Task01 {
    public static void main(String[] args) {
        Ariplane ariplane1 = new Ariplane("boening", 2021, 40, 4000);
        Ariplane ariplane2 = new Ariplane("boening", 2021, 40, 4000);

        Ariplane.compareAirplanes(ariplane1, ariplane2);
    }
}
