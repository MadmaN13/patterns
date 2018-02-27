package strategy.behavior.impl.quack;

import lombok.extern.slf4j.Slf4j;
import strategy.behavior.common.QuackBehavior;

@Slf4j
public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        LOGGER.info("Squeak-squeak!");
    }
}
