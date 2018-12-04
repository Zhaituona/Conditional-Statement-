package arrayList;

import java.util.ArrayList;

public class UseOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>  i = new ArrayList<Integer>();
        String n = "7";// if you have a String , you want to convert to an ArrayList element
        i.add(100);
        i.add(12);
        i.add(120);
        i.add(130);
        System.out.println(i.size());
        i.add(32);
        i.add(10);
        i.add(1,13);// this method it will add value in to the ArrayList
        i.remove(1);// it will remove the one we added before .

        Integer h = i.set(1, Integer.parseInt(n));
        System.out.println(h);
        System.out.println(i.size());// it means the size can change
        System.out.println(i.size());
        for(int v = 0; v < i.size();v++){
            System.out.println(i.get(v));
        }

        System.out.println("____________");


        ArrayList<String> s = new ArrayList<String>();// this is String type arrayList
        s.add("abd");
        s.add("hello");
        s.add("z");
        System.out.println(s.size());
        System.out.println("________________");
        System.out.println("The element of the ArrayList");

        for(int a =0; a< i.size(); a++){// for show the element of the ArrayList
            System.out.println(i.get(a));
        }
        System.out.println("This is String ArrayList element");
        for(int b = 0; b<s.size(); b++){
            System.out.println(s.get(b));
        }
        System.out.println(i.get(0)); // we can use get method to get the value of the ArrayList
        System.out.println(s.get(2));
        //System.out.println(s.get(3));  it will happend compile time error ,cause bounde of exception

    }
}
