class Car {

	int position;
	String colour;

	class Wheel {

		int radius;

		Wheel(int radius){
			this.radius = radius;
		}
	}

	Wheel[] wheels = new Wheel[4];


	static class Garage {
		static int numberofcars = 0;
	}



	Car(int radius){
		this.position = 30;
		this.colour = "0xFF0000";

		this.wheels = new Wheel[4];
		for(int i=0; i<4; i++){
			this.wheels[i] = new Wheel(radius);
		}

		Garage.numberofcars++;
	}


	public static void main(String[] args){

		Car myCarA = new Car(15);
		Car myCarB = new Car(100);


		System.out.println("My car A: " + myCarA.position + ", " + myCarA.colour + ", " + myCarA.wheels[0].radius);
		System.out.println("My car B: " + myCarB.position + ", " + myCarB.colour + ", " + myCarB.wheels[0].radius);
		System.out.println("You have a total of " + Garage.numberofcars + " cars in your garage.");

		return;
	}
}