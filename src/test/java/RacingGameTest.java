import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.everyItem;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;


public class RacingGameTest {
    List<Car> cars;
    RacingGame game;

    @Test
    public void 차량3대_5회레이싱() {
        cars = new ArrayList<>();
        for(int i=0; i<3; i++){
            cars.add(new Car());
        }
        game = new RacingGame();
        game.race(5, cars);
        assertThat(cars.stream().map(Car::drawRacingRoad).collect(Collectors.toList()),
                    everyItem(anyOf(is(""), is("="), is("=="), is("==="), is("===="), is("====="))));
    }

    @Test
    public void 차량3대_1회레이싱() {
        cars = new ArrayList<>();
        for(int i=0; i<3; i++){
            cars.add(new Car());
        }
        game = new RacingGame();
        game.repeat(cars);
        assertThat(cars.stream().map(Car::drawRacingRoad).collect(Collectors.toList()),
                everyItem(either(is("")).or(is("="))));

    }
}