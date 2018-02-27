package strategy.client.impl;

import org.junit.Test;
import strategy.behavior.impl.fly.RocketFly;
import strategy.client.common.Duck;

import static org.junit.Assert.*;

public class ModelDuckTest {

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();

        model.display();
        model.performQuack();
        model.performFly();

        // set behavior
        model.setFlyBehavior(new RocketFly());
        model.performFly();
    }

}