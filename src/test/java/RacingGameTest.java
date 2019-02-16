import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RacingGameTest {

    private RacingGame racingGame;

    @Before
    public void setUp() throws Exception {
        racingGame = new RacingGame();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testInit() {
        int numCar = 3;
        int tryCount = 5;
        racingGame.init(numCar, tryCount);
        assertThat(racingGame.getCars().size(), is(numCar));
    }

    @Test
    public void testGame() {
        racingGame.init(4, 10);
        racingGame.start();
        racingGame.print();
    }
}