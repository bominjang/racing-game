package com.ccstudy.racing.common;

import org.junit.Test;

import java.util.Comparator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class RandomNumberGeneratorTest {

    @Test
    public void 랜덤리스트_생성기의_범위를_체크한다() {
        //given
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        //when
        List<Integer> numbers =numberGenerator.generateNumber(10000);
        //then
        int max =numbers.stream().max(Comparator.comparingInt(Integer::byteValue)).get();
        int min =numbers.stream().min(Comparator.comparingInt(Integer::byteValue)).get();

        assertThat(max).isEqualTo(9);
        assertThat(min).isEqualTo(0);
    }

}