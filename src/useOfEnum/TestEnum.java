package useOfEnum;

public class TestEnum {
    public static void main(String[] args) {

        Level l = Level.high;
        System.out.println(l.getValue());
        switch(l){
            case high:{
                System.out.println(Level.high);
                break;
            }
            case medium:{
                System.out.println(Level.medium);
                break;
            }
            case low:{
                System.out.println(Level.low);
                break;
            }
        }





    }

            }


