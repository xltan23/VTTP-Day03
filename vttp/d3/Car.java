package vttp.d3;

public class Car implements Controllable {

    // Members and properties
    private String name;
    private String make;
    private String colour;
    private Integer engineCapacity;
    private Boolean started = false;

    // Constructors
    public Car() {
        System.out.println("Instantiating car object...");
        this.colour = "red"; //Colour of default car
    }
        
    public Car(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Car(String colour, String make) {
        this.colour = colour;
        this.make = make;
    }

    public Car(String name) {
        this.name = name;
    }

    // Getters and setters 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getEngineCapacity() {
        return engineCapacity;
    }
    public void setEngineCapacity(Integer engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }

    public Boolean getStarted() {
        return started;
    }
    public void setStarted(Boolean started) {
        this.started = started;
    }

    // Methods 
    public void start() {
        if (this.started) {
            System.out.println("Car is already running");
        } else {
            System.out.println("Vroooom......");
            this.started = true;
        }
    }

    public void stop() {
        if (this.started) {
            System.out.println("Splutter..Splutter...Stop");
            this.started = false;
        } else {
            System.out.println("Car is not moving");
        }
    }
    
}