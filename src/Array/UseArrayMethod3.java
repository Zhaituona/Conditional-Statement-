package Array;

public class UseArrayMethod3 {
    public static void main(String[] args) {
        int [] small = {12,1,3,4,5,6};
        int [] large = {123,345,3561,1235,8956,569,167,497,16};
        System.arraycopy(small , 2,large,3,4);
        for (int k = 0; k < large.length; k++){
            System.out.println(large[k]);
        }
    }
}
