package constructer;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.max(12,13));
        System.out.println(cal.add(12,13));
        System.out.println(cal.total + 5);
        cal.displayNameOfCalculator();
        cal.add(12,13);
    }
}
