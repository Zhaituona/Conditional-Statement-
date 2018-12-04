package Array;

public class UseArrayAndLoop {
    public static void main(String[] args) {
        String[] emp = new String[4];


        emp[0] = "kiris";
        emp[1] = "linden";
        emp[2] = "keram";
        emp[3] = "lindes";

        System.out.println(emp.length);
        for (String anEmp : emp) {// this is for each loop
            // System.out.println(emp[i]);
        }
       for(int i =0 ; i< emp.length; i++){ // this is for loop
           System.out.println(emp[i]);
       }


    }
}
            

            




