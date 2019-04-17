package observerpattern.observer.impl;

import observerpattern.observer.Observer;
import observerpattern.subject.Subject;
import observerpattern.subject.impl.SchoolSubject;

/**
 * Description 学生观察者
 *
 * @author liub
 * @date 2019-04-17 16:15
 */
public class StudentObserver implements Observer {

    Subject schoolSubject;

    public StudentObserver(Subject schoolSubject) {
        this.schoolSubject = schoolSubject;
        this.schoolSubject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        if (schoolSubject instanceof SchoolSubject) {
            System.out.println("全体学生已收到此消息，消息内容为：" + ((SchoolSubject) schoolSubject).getMsg());
        }
    }
}
