package Day05;

public class Car { // файл без конструктора только геттеры сеттеры
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

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

    //    что бы не нарушать Task01 принципы инкапсуляции мы сделали приватными примитивы
//TODO: alt+insert (getter and setter) (constructor)
    private int year;
    private String model;
    private String color;

}
