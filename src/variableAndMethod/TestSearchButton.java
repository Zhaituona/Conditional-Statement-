package variableAndMethod;

public class TestSearchButton {
    public static void main(String[] args) {
        SearchButton sb = new SearchButton();
        sb.firstName = "ABC";
        sb.lastName = "fve";
        sb.phoneNumber = 456132478;
        sb.userId = 123;
        System.out.println(sb.getPhoneNumber() + " " + sb.getUserId());
        sb.displayFirstName();
        sb.displayLastName();
    }
}
