package strategy.client.common;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import strategy.behavior.common.FlyBehavior;
import strategy.behavior.common.QuackBehavior;

@Slf4j
public abstract class Duck {
    @Setter protected FlyBehavior flyBehavior;
    @Setter protected QuackBehavior quackBehavior;

    protected Duck(){};

    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim() {
        LOGGER.info("All ducks swim!");
    }
    public abstract void display();
}
