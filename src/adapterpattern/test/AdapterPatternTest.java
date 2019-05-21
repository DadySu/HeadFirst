package adapterpattern.test;

import adapterpattern.adapter.PaymentAdapter;
import adapterpattern.baofoo.Baofoo;
import adapterpattern.baofoo.impl.BaofooImpl;
import adapterpattern.yeepay.Yeepay;

/**
 * Description 适配器测试类
 * 突然有一天项目经理说，之前使用的易宝支付，现在要换成宝付支付，但是还不能修改客户端的代码
 *
 * @author liub
 * @date 2019-05-21 11:58
 */
public class AdapterPatternTest {

    public static void main(String[] args) {

        Baofoo baofoo = new BaofooImpl();
        Yeepay yeepay = new PaymentAdapter(baofoo);
        yeepay.yeepayPayment();
    }
}
