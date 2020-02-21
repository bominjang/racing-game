package com.ccstudy.racing.model;

import java.util.List;

public class Car {
    private static final int MIN_NUMBER_FOR_MOVE = 3;
    private int location;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void attemptToMove(List<Integer> generateNumbers){
        generateNumbers.forEach(this::move);
    }

    public void move(int generateNumber) {
        if (generateNumber > MIN_NUMBER_FOR_MOVE) {
            this.location++;
        }
    }

    public int getLocation(){
        return this.location;
    }

    public String getName() {
        return this.name;
    }

    public String converter() {
        StringBuilder builder = new StringBuilder();
        builder.append(name + " : ");
        for (int i = 0 ; i < location ; i++) {
            builder.append("-");
        }
        return builder.toString();
    }
}
