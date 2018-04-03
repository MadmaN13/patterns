package decorator.beverage;

import decorator.condiment.Mocha;
import decorator.condiment.Soy;
import decorator.condiment.Whip;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

@Slf4j
public class BeverageTest {

    @Test
    public void testCondimentDecorators() {
        Beverage beverage = new Espresso();
        LOGGER.info(beverage.toString());

        // plain style
        beverage = new DarkRoast();
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);
        LOGGER.info(beverage.toString());

        // decorator style
        beverage = new HouseBlend();
        beverage = new Soy(new Mocha(new Whip(beverage)));
        LOGGER.info(beverage.toString());
    }

}