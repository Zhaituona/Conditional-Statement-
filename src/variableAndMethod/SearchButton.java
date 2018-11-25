package variableAndMethod;

public class SearchButton {
    int userId ;
    String firstName;
    String lastName;
    int phoneNumber;

    public void displayFirstName(){
        System.out.println(firstName);
    }
    public void displayLastName(){
        System.out.println(lastName);
    }
    public int getUserId(){
        return  userId;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
}
