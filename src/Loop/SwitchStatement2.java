package Loop;
import java.util.Scanner;


public class SwitchStatement2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Please select a day ");
        int day = scr.nextInt();
        switch (day){
            case 1:
                System.out.println("Let's do homework");
                break;
            case 2:
                System.out.println("Let's do exercise");
                break;
            case 3:
                System.out.println("Let's going out");
                break;
            default:
                System.out.println("Let's rest");
                break;
        }
    }
}
