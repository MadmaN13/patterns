package strategy.client.impl;

import lombok.extern.slf4j.Slf4j;
import strategy.behavior.impl.fly.FlyWithWings;
import strategy.behavior.impl.quack.Quack;
import strategy.client.common.Duck;

@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        LOGGER.info("I am a mallard duck!");
    }
}
