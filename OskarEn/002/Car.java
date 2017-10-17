public class Car {
    int maxSpeed;
    String colour ;
    Boolean isEngineOn;

   //Blank constructor as I was familiarising myself after a week of not doing it
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
}
