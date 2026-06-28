public class Main {

    public static void main(String[] args) {

        Employee employee =
                new Employee("Harsha",50000);

        EmployeeDAO dao =
                new EmployeeDAO();

        dao.addEmployee(employee);

        System.out.println("Employee Added Successfully");
    }
}