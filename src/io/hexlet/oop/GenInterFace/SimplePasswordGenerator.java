//package io.hexlet.oop.GenInterFace;
//
//import org.apache.commons.lang3.RandomStringUtils;
//
//// Этот класс - конкретная реализация интерфейса PasswordGenerator
//// Методы класса генерируют простой числовой пароль
//// Сигнатура методов в точности соответствует тому, как они описаны в интерфейсе
//
//class SimplePasswordGenerator implements PasswordGenerator {
//    public String generate() {
//        return this.generate(16);
//    };
//
//    public String generate(int length) {
//        return RandomStringUtils.randomNumeric(length);
//    };
//}