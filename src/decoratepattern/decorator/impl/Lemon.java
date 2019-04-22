package decoratepattern.decorator.impl;

import decoratepattern.beverage.Beverage;
import decoratepattern.decorator.Condiment;

/**
 * Description 柠檬
 *
 * @author liub
 * @date 2019-04-22 15:00
 */
public class Lemon extends Condiment {

    private final static String LEMON_DESCRIPTION = "柠檬味的";
    private final static double LEMON_COST = 0.30;

    Beverage beverage;

    public Lemon(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return LEMON_COST + beverage.cost();
    }

    @Override
    public String getDescription() {
        return LEMON_DESCRIPTION + beverage.getDescription();
    }
}
