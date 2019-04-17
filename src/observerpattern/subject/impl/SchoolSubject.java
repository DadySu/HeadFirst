package observerpattern.subject.impl;

import observerpattern.observer.Observer;
import observerpattern.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Description 学校主体，用来给学生、教师发布通知并提供添加、删除订阅者的功能.
 * 未考虑线程安全问题，线程安全问题可参考java.util.Observable
 *
 * @author liub
 * @date 2019-04-17 16:31
 */
public class SchoolSubject implements Subject {

    List<Observer> observerList;
    /**
     * 通知给订阅者的消息
     */
    private final static String msg = "今天下午三点全校进行大扫除，请各位班主任组织好这次活动，" +
            "希望在大家的努力下还我们的大家庭一个清洁的环境";
    /**
     * 用来控制是否向订阅者通知消息
     */
    private boolean changed;


    public SchoolSubject() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.indexOf(observer) > -1) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        if (!changed) {
            return;
        }
        observerList.forEach(o -> o.update(null));
        changed = false;
    }

    @Override
    public void notifyObserver(String msg) {
        if (!changed) {
            return;
        }
        observerList.forEach(o -> o.update(msg));
        changed = false;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public String getMsg() {
        return msg;
    }


    public void setChanged() {
        this.changed = true;
    }
}
