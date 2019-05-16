package singletonpattern;

/**
 * Description 懒汉式单例 - 线程不安全
 *
 * @author liub
 * @date 2019-05-16 17:10
 */
public class Singleton1 {

    private static Singleton1 uniqueInstance;

    public Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (uniqueInstance != null) {
            return new Singleton1();
        } else {
            return uniqueInstance;
        }
    }

}
