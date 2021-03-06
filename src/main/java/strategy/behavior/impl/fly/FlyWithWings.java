package strategy.behavior.impl.fly;

import lombok.extern.slf4j.Slf4j;
import strategy.behavior.common.FlyBehavior;

@Slf4j
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        LOGGER.info("Flying with wings!");
    }
}
