package org.ccstudy.racing;

public class Car {

    private final static int HURDLE = 4;

    private Integer position;

    public Car() {
        this.position = 0;
    }

    public void foward(final int value) {
        if (value >= HURDLE)
            this.position++;
    }

    public int getPosition(){
        return this.position;
    }
}
