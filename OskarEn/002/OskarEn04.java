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

    //Making a non static nested class
    class Engine{
        //No static methods allowed

    }

    //Methods contained herein are useful only for the outerclass, and methods are applied for the creation of an object
    static class IntSpeedLimits{
        //here, methods that are used refer to a created object but can also perform operations on non static members

        public static void makeRed(){

        }
    }

    //Handy snipper from https://stackoverflow.com/questions/1353309/java-static-vs-inner-class
    /*class A{
    class B
    {
        // static int x; not allowed here
    }

    static class C
    {
        static int x; // allowed here
    }
}

class Test
{
    public static void main(String… str)
    {
        A a = new A();

        // Non-Static Inner Class
        // Requires enclosing instance
        A.B obj1 = a.new B();

        // Static Inner Class
        // No need for reference of object to the outer class
        A.C obj2 = new A.C();
    }
}*/


}
