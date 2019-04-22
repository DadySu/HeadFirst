package decoratepattern.decorator.impl;

import decoratepattern.beverage.Beverage;
import decoratepattern.decorator.Condiment;

/**
 * Description 冰块
 *
 * @author liub
 * @date 2019-04-22 14:47
 */
public class IceCube extends Condiment {

    private static final String ICECUBE_DESCRIPTION = "带冰块的";
    private final static double ICECUBE_COST = 0.30;

    Beverage beverage;

    public IceCube(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + ICECUBE_COST;
    }

    @Override
    public String getDescription() {
        return ICECUBE_DESCRIPTION + beverage.getDescription();
    }
}
