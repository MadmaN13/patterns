package decorator.beverage;

import lombok.Getter;

public abstract class Beverage {
    @Getter protected String description;
    public abstract double cost();

    @Override
    public String toString() {
        return "Beverage{" +
                "description='" + getDescription() + "\'," +
                "cost='" + cost() + '\'' +
                '}';
    }
}
