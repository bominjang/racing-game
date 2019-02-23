package org.ccstudy.racing;

public class Car {

    private final static int HURDLE = 4;

    private String name;
    private Integer position;

    public Car(final String name) {
        this.name = name;
        this.position = 0;
    }

    public void foward(final int value) {
        if (value >= HURDLE)
            this.position++;
    }

    public String getPositionToString() {
        String now = "";
        for (int i = 0; i < this.position; i++) {
            now += "-";
        }
        return this.name + " : " + now;
    }

    public String getName() {
        return this.name;
    }

    public int getPosition() {
        return this.position;
    }
}
