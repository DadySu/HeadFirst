package decoratepattern.decorator;

import decoratepattern.beverage.Beverage;

/**
 * Description 调料装饰者
 *
 * @author liub
 * @date 2019-04-22 14:46
 */
public abstract class Condiment extends Beverage {
    public abstract String getDescription();
}
