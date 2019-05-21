package templatepattern;

/**
 * Description 抽象类，模板类，为子类提供一个模板方法（算法族），同时子类可以自己实现某些方法
 *
 * @author liub
 * @date 2019-05-21 14:23
 */
public abstract class AbstractTemplate {


    /**
     * 模板方法
     *
     * @param object
     */
    public void process(Object object) {
        validateParam(object);
        object = beforeHandle(object);
        Object object2 = afterHandle(object);
    }


    /**
     * 校验参数
     */
    private void validateParam(Object object) {
        System.out.println("校验参数");
    }

    /**
     * 前置处理（封装参数）
     */
    protected abstract Object beforeHandle(Object object);

    /**
     * 请求
     */
    protected abstract Object handle(Object object);

    /**
     * 后置处理（处理响应结果）
     */
    protected abstract Object afterHandle(Object object);
}
