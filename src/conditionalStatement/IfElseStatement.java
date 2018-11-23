package conditionalStatement;
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        int price = 5000;
        String brand = "Toyota";
        String make = "Matrix";
        Scanner scr = new Scanner(System.in);
        System.out.println("How much is your car");
        boolean carPrice= scr.hasNext();
        if(scr.hasNext()){// if statement the condition always take boolean type
            System.out.println("Toyota");

        }
        else{
            System.out.println("This is  not my car");
        }
    }

}
