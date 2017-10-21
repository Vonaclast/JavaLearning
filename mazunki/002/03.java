class Car {

	int maxSpeed;
	String colour;
	boolean isEngineOn;


	Car(int maxSpeed, String colour, boolean isEngineOn){
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.isEngineOn = isEngineOn;
	}

	public static void main(String[] args){

		Car toyota = new Car(180, "Red", false);
		
		System.out.println("The car has a maximum speed of " + toyota.maxSpeed + ", is " + toyota.colour + " and the boolean seems to be " + toyota.isEngineOn + ".");

		return;
	}
}