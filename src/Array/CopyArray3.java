package Array;

import java.util.Arrays;

public class CopyArray3 {
    public static void main(String[] args) {
        int [] a = {12,34,5,6,1,45,67,89};
        int [] b = {21,13,45,77,89,4,5,8,11,34};
        int [] c = Arrays.copyOf(b,b.length);
        for(int i = 0; i < c.length; i++){
            System.out.println(i + ": " + c[i]);
        }
    }
}
