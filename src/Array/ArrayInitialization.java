package Array;

public class ArrayInitialization {
    public static void main(String[] args) {
        int [] ary = {12,23,14,34,78,90,123};
        // we initialized an array named as ary ,
         int a = ary.length;
         System.out.println(a);
         ary = new int[] {4,5,7,90,12,56,75};// cause we reinitialized an array so
        // it will run the new one .[2] this means value of the index number 2 .
         System.out.println(ary[2]);

    }
}
