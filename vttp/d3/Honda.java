package vttp.d3;

public class Honda extends Car {
    
    public Honda() {
        this.setMake("Honda");
        this.setEngineCapacity(800);
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }
    
    public void stop(Integer count) {
        System.out.printf("Stopping in %d seconds\n", count);
    }
}
