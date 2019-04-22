package decoratepattern.test;

import decoratepattern.beverage.Beverage;
import decoratepattern.beverage.impl.BeiBingYang;
import decoratepattern.beverage.impl.Coca;
import decoratepattern.decorator.impl.IceCube;
import decoratepattern.decorator.impl.Lemon;

/**
 * Description
 *
 * @author liub
 * @date 2019-04-22 15:05
 */
public class TecorateTest {

    public static void main(String[] args) {

        Beverage coca = new Coca();
        Beverage beiBingYang = new BeiBingYang();

        // 带冰块的coca
        Beverage b1 = new IceCube(coca);
        // 柠檬味的北冰洋
        Beverage b2 = new Lemon(beiBingYang);

        // 带冰块和柠檬的coca
        Beverage b3 = new Lemon(b1);

        System.out.println(String.format("商品描述：%s，商品总价：%f",b1.getDescription(),b1.cost()));
        System.out.println(String.format("商品描述：%s，商品总价：%f",b2.getDescription(),b2.cost()));
        System.out.println(String.format("商品描述：%s，商品总价：%f",b3.getDescription(),b3.cost()));
    }
}
