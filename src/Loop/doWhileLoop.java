package Loop;

public class doWhileLoop {
    public static void main(String[] args) {
        int age = 12;// this loop will run at least one time
        do {
            System.out.println(age);
            age--;
        }
        while (age > 13);
        {// we can see the condition is not true , but cause of the
            // do the loop can run at least one time
        }
    }
}