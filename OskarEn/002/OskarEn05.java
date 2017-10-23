public class OskarEn05{

//Using the acr class from exercise 1
public static void main(String[]args){

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
    }//end of main

    //Using inner classes to collect helper methods
    private class CarModifier{

    public static Boolean turnOn(isEngineOn){
        isEngineOn = true;
        }

    }

}