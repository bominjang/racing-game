package model;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CarTest {

    private Car car;

    @Before
    public void setUp(){
        car= new Car();
    }

    @Test
    public void move() {
        car.move();
        assertThat(car.getPosition(), is(1));
    }

    @Test
    public void status() {
        for(int i=0; i< 5; i++)
            car.move();
        assertThat(car.status(), is("-----"));
    }
}