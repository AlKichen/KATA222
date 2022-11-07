package web.model;

public class Car {
    private String name;
    private int horsePower;
    private int year;

    public Car() {
    }

    public Car(String name, int horsePower, int year) {
        this.name = name;
        this.horsePower = horsePower;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
