package templatepattern;

import templatepattern.impl.Alibaba;
import templatepattern.impl.Tencent;

/**
 * Description 模板模式测试类
 *
 * @author liub
 * @date 2019-05-21 14:32
 */
public class AbstractTemplateTest {

    public static void main(String[] args) {
        AbstractTemplate tencent = new Tencent();
        tencent.process("腾讯：");

        AbstractTemplate ali = new Alibaba();
        ali.process("阿里：");
    }
}
