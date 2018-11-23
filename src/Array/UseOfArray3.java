package Array;

public class UseOfArray3 {
    public static void main(String[] args) {
        int []a = new int[10];
        for(int i = 1; i <a.length ; i++){
            System.out.println(a[i]);// it means index is 99, cause start from 0 ,
            // but we did not initialzation so value is 0 for all of them ,
        }
    }
}
