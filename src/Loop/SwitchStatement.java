package Loop;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Select an option 1,2,3,4");
        int num = scr.nextInt();
        switch(num){
            case 1:
                System.out.println("Let's start the class");
                break;
            case 2:
                System.out.println("Let's take some break");
                break;
            case 3:
                System.out.println("Let's do some homework");
                break;
            case 4:
                System.out.println("Let's going out");
                break;
            default:
                System.out.println("just rest");
                break;
        }
    }
}
