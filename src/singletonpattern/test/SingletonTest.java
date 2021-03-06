package singletonpattern.test;

import singletonpattern.Singleton1;
import singletonpattern.Singleton2;

/**
 * Description
 *
 * @author liub
 * @date 2019-05-20 16:42
 */
public class SingletonTest {

    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();

        Singleton2 singleton2 = Singleton2.getInstance();
    }
}
