package Array;

public class TwoDimArray {
    public static void main(String[] args) {
        String [][] s = new String[3][4];//declaration
        System.out.println(s.length);// this is rows
        System.out.println(s[0].length);  // this is column ,cause column is same
        System.out.println(s[1].length);

        s[0][0]= "A";
        s[0][1]= "B"; //row 0 , 4 column
        s[0][2]= "C";
        s[0][3]= "D";

        s[1][0]= "A1";
        s[1][1]= "B1";//row 1  4 column
        s[1][2]= "C1";
        s[1][3]= "D1";

        s[2][0]= "A2";
        s[2][1]= "B2";   // row 2  4column
        s[2][2]= "C2";
        s[2][3]= "D2";

        System.out.println(s[1][2]);

        //print all of the value of 2D Array
        // nested for loop
        // row 0 column 0-3
        //row 1 column 0-3
        //row 2 column 0-3

        for(int row =0;row< s.length; row++){
            for(int column = 0; column <s[0].length; column++){
                System.out.println(s[row][column]);
            }
        }

    }
}
