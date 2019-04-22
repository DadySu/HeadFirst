package decoratepattern.beverage.impl;

import decoratepattern.beverage.Beverage;

/**
 * Description 可口可乐
 *
 * @author liub
 * @date 2019-04-22 14:43
 */
public class Coca extends Beverage {

    public Coca(){
        description = "可口可乐";
    }

    @Override
    public double cost() {
        return 2.00;
    }
}
