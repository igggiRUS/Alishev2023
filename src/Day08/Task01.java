package Day08;

/**
 * Создать строку, состоящую из чисел от 0 до 20000.
 * Важно понимать, что это одна строка, полученная конкатенацией ("склеиванием")
 * чисел из диапазона через пробел (0 + " " + 1 + " " + 2 + … + 20000)
 * После создания такой строки, вызов System.out.println() на этой строке должен вывести в консоль
 * сразу все числа из диапазона:
 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 … 19995 19996 19997 19998 19999 20000
 * Для того, чтобы почувствовать разницу в производительности между конкатенацией обычных строк (класс String)
 * и использование StringBuilder, реализуйте описанную задачу этими двумя способами,
 * замеряя время работы программы.
 */

// TODO: StringBuilder
public class Task01 {
    public static void main(String[] args) {
        String numbers = "";

        long before = System.currentTimeMillis();

        for (int i = 0; i <= 20_000; i++)
            numbers += i + " ";

        long after = System.currentTimeMillis();

        System.out.println("время выполения цикла классом String: " + (after - before));
//        System.out.print(numbers);

        System.out.println("");

        StringBuilder stringBuilder = new StringBuilder("");

        before = System.currentTimeMillis();

        for (int i = 0; i <= 9_450_000; i++)
        stringBuilder.append(i).append(" ");

        after = System.currentTimeMillis();

//        System.out.print(stringBuilder);
        System.out.println("");


        System.out.println("время цикла классом StringBulder " + (after - before));
    }
}
