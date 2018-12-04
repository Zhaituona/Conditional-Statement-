package arrayList;

import java.util.ArrayList;

public class UseArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();// declare a ArrayList , int type
        ArrayList<String>  s = new ArrayList<String>();// declare a ArrayList , String
        ArrayList<Character> c = new ArrayList<Character>();
        ArrayList<Boolean> b = new ArrayList<Boolean>();

        a.add(12);// give the value and also add the size of the ArrayList
        a.add(23);
        a.add(50);
        a.add(100);
        System.out.println(a.size());
        for(int i =0;i <a.size(); i ++){// print out all the element of the ArrayList
            System.out.println(a.get(i));
        }
        System.out.println("Under this for the String ArrayList");
        s.add("hello");
        s.add("my");
        s.add("you");
        System.out.println(s.size());
        for(int k =0;k< s.size(); k++){
            System.out.println(s.get(k));
        }
        System.out.println("The first element of the ArrayList is: " + s.get(0));




    }
}
