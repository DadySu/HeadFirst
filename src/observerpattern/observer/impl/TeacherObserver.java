package observerpattern.observer.impl;

import observerpattern.observer.Observer;
import observerpattern.subject.Subject;
import observerpattern.subject.impl.SchoolSubject;

/**
 * Description 教师观察者
 *
 * @author liub
 * @date 2019-04-17 16:22
 */
public class TeacherObserver implements Observer {

    Subject schoolSubject;

    public TeacherObserver(Subject schoolSubject) {
        this.schoolSubject = schoolSubject;
        this.schoolSubject.registerObserver(this);
    }

    @Override
    public void update(String msg) {
        if (schoolSubject instanceof SchoolSubject) {
            System.out.println("教师已收到此消息，消息内容为：" + ((SchoolSubject) schoolSubject).getMsg());
        }
    }
}
