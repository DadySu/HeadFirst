package observerpattern.test;

import observerpattern.observer.impl.StudentObserver;
import observerpattern.observer.impl.TeacherObserver;
import observerpattern.subject.Subject;
import observerpattern.subject.impl.SchoolSubject;

/**
 * Description
 *
 * @author liub
 * @date 2019-04-17 16:55
 */
public class ObserverTest {

    public static void main(String[] args) {
        Subject subject = new SchoolSubject();
        TeacherObserver teacherObserver = new TeacherObserver(subject);
        StudentObserver studentObserver = new StudentObserver(subject);

        ((SchoolSubject) subject).setChanged();
        subject.notifyObserver(((SchoolSubject) subject).getMsg());


    }
}
