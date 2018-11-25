package constructer;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.displayEmployeeName();

        Employee emp2 = new Employee( 1234);
        System.out.println(emp2.totalEmployee);
        Employee emp3 = new Employee(101,202);
        System.out.println(emp2.employeeID);
        Employee emp4 = new Employee("Seemal","PKA");
        Employee emp5 = new Employee(123,456,"Zana","ET");
        System.out.println(emp2.totalEmployee);
        System.out.println(emp3.employeeID);
        System.out.println(emp3.managerID);
        System.out.println(emp4.employeeName + " " + emp4.employeeRegion);
        System.out.println(emp5.employeeID);
        System.out.println(emp5.managerID);
        System.out.println(emp5.employeeName + " " + emp5.employeeRegion);



    }
}
