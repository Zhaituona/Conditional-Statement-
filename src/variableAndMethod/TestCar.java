package variableAndMethod;

public class TestCar {
    public static void main(String[] args) {
        Car myCar = new Car();

        MordenCar car2 = new MordenCar();
        car2.getCarprice();

        myCar.displayCarModel();
        myCar.displayCarYear();

        System.out.println("The price of my new car  : "+ myCar.getCarPrice());
        System.out.println("The make of my car is  : " + myCar.getMake());
        System.out.println(car2.carName  + " " + car2.carPrice);
        System.out.println(car2.displayCarName());
    }
}
