import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void 숫자4이상이주어지면_한칸전진() {
        Car car = new Car();
        car.move(5);
        String result = car.drawRacingRoad();
        assertThat(result, is("="));
    }

    @Test
    public void 숫자4미만이주어지면_이동안함() {
        Car car = new Car();
        car.move(3);
        String result = car.drawRacingRoad();
        assertThat(result, is(""));
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