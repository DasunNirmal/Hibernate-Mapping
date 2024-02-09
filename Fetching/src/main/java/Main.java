import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, 1);

//        Lazy Fetching
        /*List<Laptop> laptops = student.getLaptops();
        for (Laptop laptop : laptops) {
            System.out.println(laptop.getModel());
            Hibernate: select s1_0.id,s1_0.address,s1_0.name from Student s1_0 where s1_0.id=?
            Hibernate: select l1_0.student_id,l1_0.id,l1_0.model from Laptop l1_0 where l1_0.student_id=?
            Dell
        }*/

//        Eager Fetching
        /*System.out.println(student);
        Hibernate: select s1_0.id,s1_0.address,s1_0.name,l1_0.student_id,l1_0.id,l1_0.model from Student s1_0 left join Laptop l1_0 on s1_0.id=l1_0.student_id where s1_0.id=?
        entity.Student@93bf0e0*/

        transaction.commit();
        session.close();
    }
}
