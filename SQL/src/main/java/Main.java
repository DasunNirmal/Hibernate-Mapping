import config.FactoryConfiguration;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery nativeQuery = session.createNativeQuery("SELECT * FROM Student");
        nativeQuery.addEntity(Student.class);

        List<Student> studentList = nativeQuery.list();
        for (Student student : studentList) {
            System.out.println(student.getName());
        }

        transaction.commit();
        session.close();
    }
}
