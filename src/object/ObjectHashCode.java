package object;

//import java.util.Arrays;

public class ObjectHashCode {
    public static void main(String[] args) {


        String s = new String("OK");
        StringBuilder sb = new StringBuilder(s);
        System.out.println(s.hashCode() + "  "+ sb.hashCode());
        System.out.println(sb.toString());// even the Object class has toString and String class
        // overriding that method , so if we call toString method , that will call the method coming
        // from String class . cause String class extends Object class .
        


        String s1 = new String( "OK");
        StringBuilder s2 = new StringBuilder(s1);
        System.out.println(s1.hashCode() + "  "+ s2.hashCode());
        System.out.println(s== s1);
        System.out.println(s.hashCode()==s1.hashCode());

        StringBuffer s3 = new StringBuffer(s);
        System.out.println(s.hashCode() + "  "+ s3.hashCode());

        StringBuffer  s4 = new StringBuffer(s1);
        System.out.println(s1.hashCode() + "  "+ s4.hashCode());


        System.out.println("________________________");
        System.out.println("This is for the different String value ");

        String z = "OK";
        StringBuilder  x = new StringBuilder(z);
        System.out.println(z.hashCode()  +  " "+ x.hashCode());

        String c = "No";
        StringBuilder  v = new StringBuilder(c);
        System.out.println(c.hashCode() + " "+ v.hashCode());

        System.out.println("_________________________");

        int [ ] ary = {12,4,5,7,8};

        System.out.println(ary.hashCode());








        }
    }

