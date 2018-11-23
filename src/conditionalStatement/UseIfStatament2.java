package conditionalStatement;

public class UseIfStatament2 {
    public static void main(String[] args) {
        int computerPrice = 1900;
        String computerBrand = "MAC";
        String quality = "Good";
        if(computerPrice >= 1900){
            System.out.println(computerBrand +" "+  "is " + " " + quality) ;
        }
        else{
            System.out.println("Let's buy another computer");
        }
    }
}
