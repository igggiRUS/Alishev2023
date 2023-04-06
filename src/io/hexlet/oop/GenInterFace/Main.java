//package io.hexlet.oop.GenInterFace;
//
//public class Main {
//    public static void main(String[] args) {
//        // Создадим два разных генератора паролей, реализующих PasswordGenerator
//        PasswordGenerator simpleGenerator = new SimplePasswordGenerator();
//        PasswordGenerator superGenerator = new SuperPasswordGenerator();
//
//        UserController controller = new UserController();
//
//        // Сюда мы можем передать любой класс,
//        // Который реализует интерфейс PasswordGenerator
//        var simplePass = controller.create(simpleGenerator);
//        System.out.println("Простой пароль: " + simplePass);
//
//        var superPass = controller.create(superGenerator);
//        System.out.println("Супер пароль: " + superPass);
//    }
//}