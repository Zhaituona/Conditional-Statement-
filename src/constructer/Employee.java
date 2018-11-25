package constructer;

public class Employee {
    int employeeID ;
    int managerID  ;
    String employeeName ;
    String employeeRegion ;
    int totalEmployee = employeeID + managerID;

    public Employee(){// constructor

    }

    public Employee(int employeeID,int managerID){//constructor
        this.employeeID= employeeID;
        this.managerID = managerID;
    }

    public Employee(String employeeName ,String employeeRegion){//constructor
        this.employeeName= employeeName;
        this.employeeRegion = employeeRegion;
    }
    public Employee(int employeeID ,int managerID ,String employeeName , String employeeRegion){
        //constructor
        this.managerID = employeeID;
        this.managerID = managerID;
        this.employeeName = employeeName;
        this.employeeRegion = employeeRegion;
    }

    public Employee(int totalEmployee){
        this.totalEmployee = totalEmployee;
    }

    public void displayEmployeeName(){
        System.out.println(employeeName);
    }
    public int getEmployeeID(){
        return employeeID;
    }
    public int getTotalEmployee(){
        return totalEmployee;
    }
}
