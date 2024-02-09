import config.FactoryConfiguration;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

//        Query query = session.createQuery("from Student where id = ? 1");
//        query.executeUpdate();

//        Query query1 = session.createQuery("from Student where name = ? 1");
//        query1.setParameter(1,"dd");
//        Student student = (Student) query1.uniqueResult();
//        System.out.println(student.getName());

//        List<Student> studentList = query.list();
//
//        for (Student student : studentList) {
//            System.out.println(student.getName());
//        }

//        Query query = session.createQuery("select id,name from Student where id = ? 1");
//        query.setParameter(1,1);
//        Object [] objects = (Object[]) query.uniqueResult();
//        System.out.println(objects [0]);

//        Query query = session.createQuery("select id,name from Student");
//        List<Object[]> objects = query.list();
//
//        for (Object object : objects) {
//            System.out.println(Arrays.toString((Object[]) object));
//        }

        transaction.commit();
        session.close();
    }
}
