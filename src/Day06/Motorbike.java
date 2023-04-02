package Day06;

public class Motorbike {
    //    что бы не нарушать Task01 принципы инкапсуляции мы сделали приватными примитивы
    //TODO: alt+insert (constructor) (setter)

    // 1 свойства
    private String model;
    private String color;
    private int year;

    //2 конструктор


    public Motorbike(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //3 геттеры сеттеры


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //3 метод
    public void info() {
        System.out.println("это мотоцикл");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - year);
    }

}
