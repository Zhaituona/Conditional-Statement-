package conditionalStatement;

public class IfElse2 {
    public static void main(String[] args) {
        int salary = 2000;
        int age = 30;
        if(salary > 2000 && age < 30){
            System.out.println("You can work");
        }
        else if (salary >= 2000 && age <= 30){
            System.out.println("You are awesome");
        }
        else if (salary < 2000 && age > 30){
            System.out.println("You can break");
        }
        else {
            System.out.println("Nothing");
        }
    }
}
