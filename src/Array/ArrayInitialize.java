package Array;

public class ArrayInitialize {
    public static void main(String[] args) {


        int[] num = {12, 45, 1, 3, 6, 7, 9, 80};
        System.out.println(num[5]);
        System.out.println(num.length);
        num = new int[]{12, 56, 198, 987, 9, 8, 7, 4, 0};// we reitialized the array , name same ,
        // but the value is changed .
        System.out.println(num[5]);
        System.out.println(num.length);
        int v = num.length - 1;
        System.out.println(v);
    }
}