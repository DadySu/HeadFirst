package templatepattern.impl;

import templatepattern.AbstractTemplate;

/**
 * Description 腾讯实现类
 *
 * @author liub
 * @date 2019-05-21 14:31
 */
public class Alibaba extends AbstractTemplate {
    @Override
    protected Object beforeHandle(Object object) {
        String str = object + "请求阿里接口的前置处理";
        System.out.println(str);
        return str;
    }

    @Override
    protected Object handle(Object object) {
        String str = object + "请求阿里接口的前置处理";
        System.out.println(str);
        return str;
    }

    @Override
    protected Object afterHandle(Object object) {
        String str = object + "请求阿里接口的前置处理";
        System.out.println(str);
        return str;
    }
}
