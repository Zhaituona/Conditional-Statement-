package Loop;
import java.util.Scanner;

public class UseOfForLoop {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("How old are you?");
        int a = scr.nextInt();
        System.out.println("Do you know the ID number of your classmate?");
        int b = scr.nextInt();
        for(int i =1; i <= b; i++){
            System.out.println(i);
        }
    }
}
