public class Car {
    int maxSpeed;
    String colour ;
    Boolean isEngineOn;

    public Car(){
        maxSpeed = 0;
        colour = "";
        isEngineOn = true;
    }

    public Car(int maxSpeed, String colour, Boolean isEngineOn){
        this.maxSpeed = maxSpeed;
        this.colour = colour;
        this.isEngineOn = isEngineOn;
    }

    //https://www.tutorialspoint.com/java/java_innerclasses.htm
    //TODO: read up on these, still don't understand the usefullness 
}