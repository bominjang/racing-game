package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RacingGameInfoTest {

    private  RacingGameInfo racingGameInfo;

    @Before
    public void setUp() throws Exception {
        racingGameInfo = new RacingGameInfo(4,3,5);
    }

    @Test
    public void getCars() {
        assertThat(racingGameInfo.getCars().size(), is(5));
    }

}