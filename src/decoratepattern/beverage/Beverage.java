package decoratepattern.beverage;

/**
 * Description 饮料的抽象类
 *
 * @author liub
 * @date 2019-04-22 14:30
 */
public abstract class Beverage {

    public String description = "饮料";

    public String getDescription() {
        return description;
    }

   public abstract double cost();
}
