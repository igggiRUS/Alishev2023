package zaur;

public class App02 {
    /**
     * аргументы из объекта вошли в метод
     * мы полчили сумму в виде int
     * сумма вернулась в объект в виде ссылки
     * ссылка преобразовалась в int
     */
    public static int sum(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void main(String[] args) {
        /**
         * 1. мы создаем объект => App02 t = new App02();
         * (ссылку на объект)
         * оперируем с функцией/методом
         */

        App02 t = new App02();
        int sumAll = t.sum(1, 12, 32);
        }
}

