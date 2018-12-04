package conditionalStatement;

public class IfElse3 {
    public static void main(String[] args) {
        int value1= 100;
        int value2= 150;
        int value3= 145;
  // under the for loop one condition is correct , then will not execute other condition .
        if(value1> value2){
            System.out.println(value1 + " "+ "is bigger than" +  " "+ value2);
        }
        else if (value1 < value2){
            System.out.println(value2+ " "+ "is biggern that "+ " "+ value1);

        }
        else if(value1 > value3){
            System.out.println(value1 + " "+ "is bigger than" +  " "+ value3);
        }
        else if(value1 < value3){
            System.out.println(value3 + " "+ "is bigger than" +  " "+ value1);
        }
        else if(value2 >value3){
            System.out.println(value2 + " "+ "is bigger than" +  " "+ value3);
        }
        else if(value2 <value3){
            System.out.println(value3 + " "+ "is bigger than" +  " "+ value2);
        }
    }
}
