package singletonpattern;

/**
 * Description
 * 当 Singleton 类加载时，静态内部类 SingletonHolder 没有被加载进内存。只有当调用 getInstance()
 * 方法从而触发 SingletonHolder.INSTANCE 时 SingletonHolder 才会被加载，此时初始化 INSTANCE 实例，并且 JVM 能确保 INSTANCE 只被实例化一次。
 * 这种方式不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持。
 *
 * @author liub
 * @date 2019-05-16 17:50
 */
public class Singleton5 {

    /**
     * 静态内部类只有在被调用的时候才会加载，与静态方法一样
     */
    public static class SingletonHolder {
        private static final Singleton5 uniqueInstance = new Singleton5();
    }

    public static Singleton5 getInstance() {
        return SingletonHolder.uniqueInstance;
    }
}