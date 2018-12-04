package arrayList;

import java.util.ArrayList;

public class UseArrayList3 {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();// declare a ArrayList , int type
        ArrayList<String>  s = new ArrayList<String>();
        String v = "1234";
        int c = 20;
        a.add(12);// give the value and also add the size of the ArrayList
        a.add(23);
        a.add(50);
        a.add(100);
        a.add(1,10);
        int b = Integer.parseInt(v);// we convert String to int then put it it to the ArrayList
        a.add(3,b);
        System.out.println(a.get(3));
        System.out.println(a.get(1));
        System.out.println(a.size());
        a.remove(1);
        System.out.println(a.get(1));
        System.out.println(a.size());

        s.add("java");
        s.add("I");
        s.add("like");
        String n = String.valueOf(c);// convert int yo String
        s.add(n);
        System.out.println(s.size());
        System.out.println(s.get(3));
        s.add(1,n);
        System.out.println(s.get(1));


    }


}
