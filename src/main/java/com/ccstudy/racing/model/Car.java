package com.ccstudy.racing.model;

import java.util.List;

public class Car {
    private static final int MIN_NUMBER_FOR_MOVE = 3;
    private int location;

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
}
