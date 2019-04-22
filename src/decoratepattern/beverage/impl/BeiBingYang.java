package decoratepattern.beverage.impl;

import decoratepattern.beverage.Beverage;

/**
 * Description 北冰洋饮料
 *
 * @author liub
 * @date 2019-04-22 14:32
 */
public class BeiBingYang extends Beverage {

    public BeiBingYang(){
        description = "北冰洋";
    }

    @Override
    public double cost() {
        return 1.01;
    }
}
