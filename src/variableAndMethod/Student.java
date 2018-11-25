package variableAndMethod;

public class Student {
    int studentID = 12;// declare and initialize variableAndMethod int type primitive variableAndMethod
    String studentName = "Amina";
    char studentGrade = 'A';

    public void displayStudentName(){//not return type method
        System.out.println(studentName);
    }
    public int getStudentID(){//return type method .
        return studentID;
    }
}
