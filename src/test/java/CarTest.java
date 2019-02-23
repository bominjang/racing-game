import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {

    @Test
    public void 숫자4이상이주어지면_한칸전진() {
        Car car = new Car("수정차");
        car.move(5);
        String result = car.getRacingRoad();
        assertThat(result, is("="));
    }

    @Test
    public void 숫자4미만이주어지면_이동안함() {
        Car car = new Car("수정차");
        car.move(3);
        String result = car.getRacingRoad();
        assertThat(result, is(""));
    }

    @Test
    public void 다섯번전진후_이동거리출력() {
        Car car = new Car("수정차");
        for(int i=0; i<5; i++){
            car.move(5);
        }
        String result = car.getRacingRoad();
        assertThat(result, is("====="));
    }

    @Test
    public void 위치에따라우선순위비교_같으면동급() {
        Car car1 = new Car("수정차");
        Car car2 = new Car("남의차");
        car1.move(5);   // 1이동
        car2.move(5);   // 1이동
        assertThat(car1.compareTo(car2), is(0));
    }
}