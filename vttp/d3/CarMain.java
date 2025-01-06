package vttp.d3;

public class CarMain {

    public static void main(String[] args) {
        // Instantiating car object...
        Car myCar = new Car();
        System.out.printf("The car colour is currently %s\n", myCar.getColour());
        myCar.setColour("blue");
        System.out.printf("The new car colour is %s\n", myCar.getColour());
        myCar.setEngineCapacity(2500);
        System.out.printf("The engine capacity is %d\n", myCar.getEngineCapacity());
    

        Car myFamilyCar = new Car("black","BMW");
        System.out.printf("My family car is a %s %s\n", myFamilyCar.getColour(), myFamilyCar.getMake());
        myFamilyCar.start();
        myFamilyCar.setEngineCapacity(700);
        System.out.printf("My family car is started: %d\n", myFamilyCar.getEngineCapacity()); 

        Honda civic = new Honda();
        System.out.printf("My new car colour is %s\n", civic.getColour());
        System.out.printf("My new car brand is %s\n", civic.getMake());
        System.out.printf("My new car engine capacity is %d\n", civic.getEngineCapacity());
        civic.start();
        civic.accelerate();
        Integer count = 5;
        civic.stop(count);
    }
    
}
