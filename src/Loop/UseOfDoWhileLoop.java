package Loop;
import java.util.Scanner;

public class UseOfDoWhileLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("How much money you need?");
        int money = scr.nextInt();
        System.out.println("How much money you will be satisfied?");
        int moremoney = scr.nextInt();
        int salary = moremoney;
        do {
            System.out.println("This will be mine goal" + " "+ "salary" + " " + salary);
            salary++;
        }
        while(salary < money);
    }



}
