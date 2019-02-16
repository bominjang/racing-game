package com.ccstudy.racing.common;

import com.ccstudy.racing.common.NumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator implements NumberGenerator {
    public List<Integer> generateNumber(int numberOfAttempt){
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0 ; i < numberOfAttempt ; i++){
            randomNumbers.add(new Random().nextInt(9));
        }
        return randomNumbers;
    }
}
