package Array;

public class Use2dimArray3 {
    public static void main(String[] args) {
        int [][] ary = {{12,3,5,7},{12,6,78,90},{31,4,23,66}};
        // use two for loop for count the array . 

        for(int row = 0;row<ary.length; row++){
            for(int column= 0; column<ary[0].length;column++){
                System.out.println(ary[row][column]);
            }
        } // most commed error is array boundec of exception, cause , array is dynamic , it can not able
        //changed automaticly , since we declared , then it decided , will not changed .
    }
}
