package strategy.client.impl;

import org.junit.Test;
import strategy.client.common.Duck;

import static org.junit.Assert.*;

public class MallardDuckTest {

    @Test
    public void testMallard() {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }

}