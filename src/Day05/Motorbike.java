package Day05;

public class Motorbike {
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }


    // экземпляры класса this

    public Motorbike(String model, String color, int year) { // конструктор
        this.model = model;
        this.color = color;
        this.year = year;
    }

    //    что бы не нарушать Task01 принципы инкапсуляции мы сделали приватными примитивы
//TODO: alt+insert (setter) (constructor)


    private int year;
    private String model;
    private String color;

}
