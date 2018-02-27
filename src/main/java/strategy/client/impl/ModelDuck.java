package strategy.client.impl;

import lombok.extern.slf4j.Slf4j;
import strategy.behavior.impl.fly.FlyNoWay;
import strategy.behavior.impl.quack.Quack;
import strategy.client.common.Duck;

@Slf4j
public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        LOGGER.info("I am a model duck!");
    }
}
