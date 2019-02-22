import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void 전진() {
        Car car = new Car();
        car.move(5);
        int result = car.getLocation();
        assertThat(result, is(1));
    }

    @Test
    public void 멈춤() {
        Car car = new Car();
        car.move(3);
        int result = car.getLocation();
        assertThat(result, is(0));
    }

    @Test
    public void 다섯번전진후_이동거리출력() {
        Car car = new Car();
        for(int i=0; i<5; i++){
            car.move(5);
        }
        String result = car.drawRacingRoad();
        assertThat(result, is("====="));
    }
}