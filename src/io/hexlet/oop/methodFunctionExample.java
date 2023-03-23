package io.hexlet.oop;


public class methodFunctionExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 12;
        int c = 423;
        int d = 43;
        System.out.println(sumExample(a, b));
        System.out.println(sumExample(8, 2));
        System.out.println(sumExample(c, d));
        System.out.println(sumExample(121, 131));

    }

    // method
    public static int sumExample(int x, int y) {
        int z = x + y;
        return z;
    }
}
