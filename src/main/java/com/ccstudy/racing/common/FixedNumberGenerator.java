package com.ccstudy.racing.common;

import java.util.ArrayList;
import java.util.List;

public class FixedNumberGenerator implements NumberGenerator {
    private static final int MOVE_NUMBER = 4;
    private static final int STOP_NUMBER = 3;
    private List<Integer> fixedNumbers = new ArrayList<>();

    private boolean flag;

    @Override
    public List<Integer> generateNumber(int numberOfAttempt) {

        this.flag = true;
        for (int i = 0; i < numberOfAttempt; i++) {
                add();
        }
        return fixedNumbers;
    }

    private void add() {
        if (flag) {
            fixedNumbers.add(MOVE_NUMBER);
            flag = false;
            return;
        }
        fixedNumbers.add(STOP_NUMBER);
        flag = true;
    }
}
