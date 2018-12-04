package constructer;
import Loop.ForLoop;// this is import between the package .
import static variableAndMethod.Car.carPrice; // it will import static part .
import variableAndMethod.Car;// import this way only import non static part .
import variableAndMethod.*; // this means add all of the classes from the variableAndMethod package

public class Test {
    public static void main(String[] args) {

        ForLoop forloop = new ForLoop();
        Car testCar = new Car();
        testCar.displayCarYear();
        Car test1= new Car();
        Car.carPrice(); // different package import static method .



        // this is for calling between packages , import specific class between the package .
        // to the another package .



    }
}
