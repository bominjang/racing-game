package dto;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RacingGameInfoTest {

    @Test
    public void 레이싱게임_도전횟수_리턴() {
        RacingGameInfo racingGameInfo = new RacingGameInfo(5, 5, new String("사용자1, 사용자2"));
        assertThat(racingGameInfo.getCountOfAttempt(),is(5));
    }


    @Test(expected = IllegalArgumentException.class)
    public void 레이싱게임_도전횟수_음수시_Exception() {
        RacingGameInfo racingGameInfo = new RacingGameInfo(5, -1, new String("사용자1, 사용자2"));
    }

    @Test
    public void 이동조건_리턴() {
        RacingGameInfo racingGameInfo = new RacingGameInfo(5, 5, new String("사용자1, 사용자2"));
        assertThat(racingGameInfo.getConditionToMove(),is(5));
    }

    @Test(expected = IllegalArgumentException.class)
    public void 이동조건_음수시_Exception() {
        RacingGameInfo racingGameInfo = new RacingGameInfo(-1, 5, new String("사용자1, 사용자2"));
    }

    @Test
    public void 참가자_리스트_출력(){
        RacingGameInfo racingGameInfo = new RacingGameInfo(5, 5, new String("사용자1, 사용자2"));
        assertThat(racingGameInfo.getAttendeeList(), is("사용자1, 사용자2"));
    }

}