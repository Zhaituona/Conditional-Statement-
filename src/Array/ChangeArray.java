package Array;

public class ChangeArray {
    public static void main(String[] args) {

        int [] ary = {12,23,4,6,89};
        change(ary);
        for(int c =0;c< ary.length;c++){
            System.out.println(ary[c]);
        }

    }
    public static void change(int []x ){// added one to the array value . usually we using array , most
        //of the case we need to use for loop ,for count and display the array .
        for(int i = 0; i <x.length;i++){
            x[i]+=1;
        }
    }


        }
