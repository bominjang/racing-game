package model;

public class Car {

    private int position;

    public int getPosition() {
        return this.position;
    }

    public int move(){
        position++;
        return this.position;
    }

}
