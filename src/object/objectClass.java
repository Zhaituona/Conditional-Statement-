package object;

import java.lang.reflect.Array;

public class objectClass {
    public static void main(String[] args) {

        Object ob1 = new String ("hello");
        Object ob2 = new String("hello");

        Object obx = new String ("23");
        //int i = Integer.valueOf(23);
        Object c = new Integer(Integer.valueOf("23"));// changed String to int then compare object

        Object ib2 = new Integer(23);

        Object i2= new String("a");
        Object i3 = new String(String.valueOf("a"));




        Object ob3 = new Boolean(true);

        Object ob4 = new Character('a');

        Object ob5 = new Float(2.36);

        Object ob6 = new Array[6];

        ob5.equals(ob3);
        System.out.println(ob5.equals(ob3));
        System.out.println(ob1.equals(ob2));// return boolean it will compare value of the object
        System.out.println(c.equals(ib2));// return boolean

        if(ob5==ob3){
            System.out.println("this is ture");
        }
        else if(ob1==ob2){
            System.out.println("This is ture for ob1 & ob2 ");
        }
        else if(c==ib2){
            System.out.println("This is ture for c & ib2");
        }
        else if(ob1 ==ob2){
            System.out.println("This is really equal");
        }
        else{
            System.out.println("they are not");
        }

        // so Object is a super class for any class in java .  it means , String ,
        // Integer , Boolean ,Character , Float all extends Object Class .
    }
}
