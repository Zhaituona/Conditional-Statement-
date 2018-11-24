package Array;

public class CopyArray2 {
    public static void main(String[] args) {
        int[] password = {12, 56, 8, 7, 69, 3245};
        int[] newPassword = {3, 5, 89, 45, 712, 369, 5, 99, 100};
        System.arraycopy(password, 3, newPassword, 4, 3);
        // we using System Class method , copy the array value
        for (int k = 0; k < newPassword.length; k++) {
            System.out.println(k + " :" + newPassword[k]);
        }

    }
}