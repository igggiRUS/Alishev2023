package Day08;

/**
 * На самом деле аннотация @Override указывает, что далее мы собираемся переопределять метод базового класса. При этом, если в базовом классе не окажется метода с аналогичной сигнатурой, то мы получим предупреждение компилятора о том, что хотя мы и собирались что-то переопределить, по факту этого не произошло.
 * На этом действие аннотации заканчивается.
 * Таким образом, аннотация никак не влияет на сам факт переопределения метода - при совпадении сигнатур с методом базового класса он и так будет переопределен, независимо от наличия, либо отсутствия этой аннотации. Аннотация служит лишь для контроля успешности действия при сборке проекта.
 * В случае отсутствия данной аннотации и не совпадении сигнатур (в результате ошибки) с методом, который мы собирались переопределять - случится страшное - очень трудноуловимая ошибка, когда вы думаете, что должно бы переопределяться, а по факту имеете отдельный независимый метод, который скорее всего вообще не выполняется. При этом компилятор считает, что с его точки зрения все в порядке - хотите собственный метод в классе-наследнике - нет проблем. И молчит.
 */
//TODO:  @Override аннотация

public class Ariplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Ariplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }


    // "Изготовитель: … , год выпуска: … , длина: … , вес: …, объем топлива в баке: …"
    public void info() {
        System.out.println("Изготовитель " + producer + ", год выпуска: " + year
                + ", длина:" + length + ", вес:" + weight + ", объем топлива в баке: " + fuel);
    }

    @Override //
    public String toString() { // из main метода обращение sout обрабатывается здесь и вместо hashCode возвращает текст понятный человеку
        return "Изготовитель " + producer + ", год выпуска: " + year
                + ", длина:" + length + ", вес:" + weight + ", объем топлива в баке: " + fuel;
    }
}
