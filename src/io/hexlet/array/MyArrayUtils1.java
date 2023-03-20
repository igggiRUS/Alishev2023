package io.hexlet.array;
import java.util.Arrays;
//TODO: bubble sorts
class MyArrayUtils {
    public static void main(String[] args) {
        int[] numbers = {4, 3, 2, 1};
        MyArrayUtils.bubbleSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    public static void bubbleSort(int[] items) {
        int itemsCount = items.length - 1;
        boolean flag;
        do { // исполнять
            flag = false; // сортировка произошла флаг НЕТ (ложь) сортировки не было
            for (int i = 0; i < itemsCount; i++) { // сортировать
                if (items[i] > items[i + 1]) { // если индекс[n] > индекс[n + 1] то входим в тело и меняем их местами через временную переменную
                    int temp = items[i]; // создаем временную переменную и присваиваем ей значение индекс[n]
                    items[i] = items[i + 1]; // присваивамем из индекса[n + 1] в индекс[n] переменную
                    items[i + 1] = temp; // значение из временной переменной (изначальное значение индекс[i]) передаем индексу[i + 1]
                    flag = true; // сортировка произошла? флаг ДА (истина)
                }
            }
            itemsCount--; // так как в конце сортировки самая правая часть является максимальным число индекс самой правой части исключается из сортировки
        } while (flag); // while (true) пока (сортировка произошла? ДА/TRUE) = действуй  while (false) пока пока (сортировка произошла? нет/FALSE) = остановись
    }
    // END
}
