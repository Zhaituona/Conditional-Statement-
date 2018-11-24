package Array;

import java.util.Arrays;

public class UseArrayMethod2 {
    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5,6,7,8,9};
        System.out.println(myArray.length);
        System.out.println(myArray[5]);
        int [] newArray = Arrays.copyOf(myArray,myArray.length);
        System.out.println(newArray.length);
        System.out.println(newArray[6]);
    }
}
