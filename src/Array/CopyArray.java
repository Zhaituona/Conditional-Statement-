package Array;

        import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int [] oldArray = {1,28,1987,7,18,1984,3,10,2015};
        int [] newArray = {4,2,2017, 123,012,568,789,4,5,6};
        int [] yourArray = Arrays.copyOf(newArray,newArray.length);
        System.out.println(yourArray[5]);
        System.arraycopy(oldArray,6,newArray,3,3);
        // this means copy 3,10,2015 three elemets to the newArray , start from position
        // three , it will take 3 , that is long of the elemntwe want to copy .
        for (int k = 0; k < newArray.length; k++){
            System.out.println(k + ":" + newArray[k]);
            // @for loop
        }
    }
}
