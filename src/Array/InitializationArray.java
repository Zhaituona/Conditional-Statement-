package Array;

import java.util.Arrays;

public class InitializationArray {
    public static void main(String[] args) {
        int [] ary = {12,34,67,90,123,567};
        double[] d = {12.34,9.87,9,12.56,12.78};
        String[] s = {"hello", " my" ," name" ," is" ,"zaytuna"};

        int [] newAry = Arrays.copyOf(ary,ary.length);
        double [] newD = Arrays.copyOf(d,d.length);


        System.out.println(ary[3]);
        System.out.println(ary.length);

        System.out.println(d[2]);
        System.out.println(d.length);

        System.out.println(s[4]);
        System.out.println(s.length);

        for(int i =0; i < ary.length; i++){
            System.out.println(ary[i]);
        }


    }
}
