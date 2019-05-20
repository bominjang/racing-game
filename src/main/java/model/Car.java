package model;

public class Car {

    private int position;

    public Car() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void move(){
        position++;
    }

    public String status(){
        StringBuilder track = new StringBuilder();
        for(int i=0; i<this.position; i++){
            track.append('-');
        }
        return track.toString();
    }
}
