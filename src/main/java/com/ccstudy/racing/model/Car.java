package com.ccstudy.racing.model;

import java.util.List;

public class Car {
    private static final int MIN_NUMBER_FOR_MOVE = 3;

    private int location;
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public Car(int location, String name) {
        this.location = location;
        this.name = name;
    }

    public int getLocation() {
        return location;
    }

    public String getName() {
        return name;
    }

    public boolean isEqualLocation(int winnerLocation) {
        return location == winnerLocation;
    }

    private void move(int generateNumber) {
        if (generateNumber > MIN_NUMBER_FOR_MOVE) {
            this.location++;
        }
    }

    public Car attemptToMove(List<Integer> generateNumbers) {
        generateNumbers.forEach(this::move);
        return this;
    }

    public String convertLocation() {
        StringBuilder convertedLocation = new StringBuilder();

        for (int i = 0; i < this.location; i++) {
            convertedLocation.append("-");
        }

        return this.name + " : " + convertedLocation;
    }
}
