package Day05;

public class Motorbike {
    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }


    // экземпляры класса this

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    //    что бы не нарушать Task01 принципы инкапсуляции мы сделали приватными примитивы
//TODO: alt+insert (setter) (constructor)




    private int year;
    private String model;
    private String color;

}
