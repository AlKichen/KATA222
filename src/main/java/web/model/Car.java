package web.model;

public class Car {
    private int id;
    private String name;
    private int horsePower;
    private int year;


    public Car() {
    }

    public Car(int id, String name, int horsePower, int year) {
        this.id = id;
        this.name = name;
        this.horsePower = horsePower;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }
}
