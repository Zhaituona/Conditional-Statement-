package conditionalStatement;

public class IfElse {
    public static void main(String[] args) {

        int value1 = 120;
        int value2 = 150;

        if ((value1 > value2 )&& (value1 % 2==0)){
            System.out.println(value1);
        }
        else if((value1 < value2) && (value1 %2 != 0)){
            System.out.println(value1 - 1);
        }
        else if((value1 < value2 )&&(value1 %2 ==0 )){ // it means this is true 
            System.out.println(value2);
        }
        else if((value1 > value2 )&& (value1 %2 != 0)){
            System.out.println(value2-1);
        }
        else {
            System.out.println("there is no any condition mach");
        }
    }
}