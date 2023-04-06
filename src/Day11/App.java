package Day11;

public class App {
    public static void main(String[] args) {
        String string = "hello";
        String string2 = "hello";
        StringBuilder stringBuilder = new StringBuilder("hello");
        StringBuilder stringBuilder2 = new StringBuilder("hello");

        //        System.out.println(string == stringBuilder);
        System.out.println(string == string2);
        System.out.println(string.equals(string2));
        System.out.println(string.equals(stringBuilder));
        System.out.println(stringBuilder.equals(stringBuilder2));

    }
}
