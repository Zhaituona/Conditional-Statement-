package Array;

import java.util.Arrays;

public class UseArrayMethod {
    public static void main(String[] args) {
        int [] ary = {12,34,14,67,38,89};
        ary[4]= 38;
        int [] newAry = Arrays.copyOf(ary,ary.length);// in this method it cn take two parameters
        // one is array name , another is length of the array
        System.out.println(newAry[4]);
    }
}
