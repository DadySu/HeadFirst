package observerpattern.subject;

import observerpattern.observer.Observer;

/**
 * 主题
 *
 * @author liub
 * @date 2019/04/17
 */
public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

    void notifyObserver(String msg);

}
