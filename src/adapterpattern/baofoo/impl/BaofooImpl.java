package adapterpattern.baofoo.impl;

import adapterpattern.baofoo.Baofoo;

/**
 * Description
 *
 * @author liub
 * @date 2019-05-21 12:01
 */
public class BaofooImpl implements Baofoo {
    @Override
    public void baofooPayment() {
        System.out.println("使用宝付支付");
    }
}
