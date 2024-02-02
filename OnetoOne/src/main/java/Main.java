import config.FactoryConfiguration;
import entity.Laptop;
import entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        Session session = FactoryConfiguration.getFactoryConfiguration().getSession();
        Transaction transaction = session.beginTransaction();

        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setModel("Dell");

        Student student = new Student();
        student.setId(1);
        student.setName("Dasun");
        student.setAddress("Ragama");
        student.setLaptop(laptop);


//        session.save(student);
//        session.save(laptop);
        session.delete(laptop);
        session.delete(student);

        /*Student student1 = session.get(Student.class, 1);
        Laptop laptop1 = session.get(Laptop.class, 1);
        System.out.println("Student :" + student1);
        System.out.println("Laptop :" + laptop1);*/

        transaction.commit();
        session.close();
    }
}
