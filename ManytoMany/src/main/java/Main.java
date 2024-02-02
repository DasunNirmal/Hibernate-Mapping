import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop laptop1 = new Laptop();
        laptop1.setId(1);
        laptop1.setModel("Dell");

        Laptop laptop2 = new Laptop();
        laptop2.setId(2);
        laptop2.setModel("Dell");

        ArrayList<Laptop> list = new ArrayList<>();
        list.add(laptop1);
        list.add(laptop2);


        Student student = new Student();
        student.setId(1);
        student.setName("Dasun");
        student.setAddress("Ragama");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Dasun");
        student2.setAddress("Ragama");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);

        student.setLaptop(list);
        student2.setLaptop(list);

        laptop1.setStudent(students);
        laptop2.setStudent(students);


        session.save(student);
        session.save(student2);
        session.save(laptop1);
        session.save(laptop2);
//        session.delete(laptop);
//        session.delete(student);

        /*Student student1 = session.get(Student.class, 1);
        Laptop laptop1 = session.get(Laptop.class, 1);
        System.out.println("Student :" + student1);
        System.out.println("Laptop :" + laptop1);*/

        transaction.commit();
        session.close();
    }
}
