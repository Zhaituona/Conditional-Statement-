package variableAndMethod;

public class Car {
    int carYear = 2010;
    int carPrice = 5000;
    public String make = "Toyota";
    String model = "Matrix";

    public void displayCarYear(){
        System.out.println(carYear);
    }
    public int getCarPrice(){
        return carPrice;
    }
    public void displayCarModel(){
        System.out.println(model);
    }
    public String getMake(){
        return make;
    }
}
