import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDAO {

    SessionFactory factory =
            new Configuration().configure().buildSessionFactory();

    public Integer addEmployee(Employee employee) {

        Session session = factory.openSession();

        Transaction tx = null;

        Integer employeeID = null;

        try {

            tx = session.beginTransaction();

            employeeID = (Integer) session.save(employee);

            tx.commit();

        } catch (Exception e) {

            if (tx != null)

                tx.rollback();

            e.printStackTrace();

        } finally {

            session.close();

        }

        return employeeID;
    }
}