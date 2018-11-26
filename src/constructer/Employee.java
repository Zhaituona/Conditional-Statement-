package constructer;

public class Employee {
    int employeeID ;// class level variable
    int managerID  ;
    String employeeName ;
    String employeeRegion ;
    int totalEmployee = employeeID + managerID;

    public Employee(){// 1.constructor , default  constructor

    }

    public Employee(int employeeID,int managerID){//2.constructor , // local variable
        this.employeeID= employeeID;
        this.managerID = managerID;
    }

    public Employee(String employeeName ,String employeeRegion){//3.constructor
        this.employeeName= employeeName;
        this.employeeRegion = employeeRegion;
    }
    public Employee(int employeeID ,int managerID ,String employeeName , String employeeRegion){
        //4.constructor
        this.managerID = employeeID;
        this.managerID = managerID;
        this.employeeName = employeeName;
        this.employeeRegion = employeeRegion;
    }

    public Employee(int totalEmployee)// 5.constructor
    {
        this.totalEmployee = totalEmployee;
    }

    public void displayEmployeeName()//1.method
    {
        System.out.println(employeeName);
    }
    public int getEmployeeID(){//2.method

        return employeeID;
    }
    public int getTotalEmployee(){//3.method

        return totalEmployee;
    }
}
