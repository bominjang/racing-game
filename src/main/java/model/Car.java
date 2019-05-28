package model;

public class Car {

    private String name;
    private int position;

    public Car(String name) {
        this.name = name;
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return name;
    }

    public int move(){
        position++;
        return this.position;
    }

}
