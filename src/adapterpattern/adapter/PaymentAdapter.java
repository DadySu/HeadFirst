package adapterpattern.adapter;

import adapterpattern.baofoo.Baofoo;
import adapterpattern.yeepay.Yeepay;

/**
 * Description 适配器，暴露给客户端的是yeepayPament()方法，实际调用的是baofooPayment()
 *
 * @author liub
 * @date 2019-05-21 11:54
 */
public class PaymentAdapter implements Yeepay {

    private Baofoo baofoo;

    public PaymentAdapter(Baofoo baofoo) {
        this.baofoo = baofoo;
    }

    @Override
    public void yeepayPayment() {
        baofoo.baofooPayment();
    }
}
