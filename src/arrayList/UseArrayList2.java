package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList2 {
    public static <E> void main(String[] args) {
        ArrayList<Integer> a= new ArrayList<Integer>();// declare a ArrayList , int type
        ArrayList<String>  s = new ArrayList<String>();// declare a ArrayList , String
        ArrayList<Character> c = new ArrayList<Character>();
        ArrayList<Boolean> b = new ArrayList<Boolean>();

        ArrayList<E> employee = new ArrayList<E>();
        Employee emp1 = new Employee(23,"Zana",123);
        Employee emp2 = new Employee(22,"Kamila",101);
        Employee emp3 = new Employee(27,"Holin",123);

        ArrayList  x=  new ArrayList();  // i want to generate the arraylist can take the object
        // not the specific data type .
        ArrayList<Employee> superEmp = new  ArrayList<Employee>();
        superEmp.add(emp1);
        superEmp.add(emp2);
        superEmp.add(emp3);

        Iterator<Employee> it = superEmp.iterator();
        while (it.hasNext()){
            Employee emp = it.next();
            System.out.println(  " the first emp1 " + emp1.name + " "+ emp1.age + " "+ emp1.ID );
            System.out.println("_________");
            System.out.println("the second emp2 " + emp2.name + emp2.age +" " + emp2.ID);
            System.out.println("_____________");
            System.out.println("the third emp3 " + emp3.name + " "+ emp3.age + " "+ emp3.ID);
        }



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


        ArrayList<String> ar = new ArrayList<String>();

        ar.add("hello");
        ar.add("java");
        ar.add("welcome");

        ArrayList<String> ar2 = new ArrayList<String>();
        ar2.add("monday");
        ar2.add("tuesday");
        ar2.add("friday");

        ar.addAll(ar2);
        ar.size() ; // it will add two ArrayList object as new ArrayList//
        // but the ar2 ArrayList is still in there .

        for(int k = 0; k < ar.size(); k++){
            System.out.println( ar.get(k));
        }
        System.out.println(ar.size());
        System.out.println(ar2.size());




    }
}
