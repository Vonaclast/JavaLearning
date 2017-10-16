
import java.text.DecimalFormat;

class sqrt {
	

	static void calcroot(double input){


		System.out.println("Input is " + input);

		double current_min = 0.0; // assign interval
		double current_max = input; // assign max of interval
		double current_avg = (current_max - current_min)/2; // find an initial middle-point

		while(Math.abs((current_avg*current_avg)-input) > 0.0001 ){ // 0.0001 needed because of retarded logaritmic floating points. anyway, check if solution is close enough

			/* Testing purposes

			System.out.println("min is " + current_min);
			System.out.println("max is " + current_max);
			System.out.println("avg is " + current_avg);


			System.out.println("Difference between " + current_avg + "*" + current_avg + " = " + (current_avg*current_avg) + " and " + input + " is " + ((current_avg*current_avg)-input));
			*/


			current_avg = (current_max + current_min)/2; //self explanatory

			if( (current_avg*current_avg) < input ){ // check whether to move to the right
				current_min = current_avg;
			} 
			else if ( (current_avg*current_avg) > input ){ //check whether to move to the left
				current_max = current_avg;
			} 

		}

		//System.out.println("Result found is: " + current_avg);

		double result = current_avg; // concluding result
		DecimalFormat df = new DecimalFormat("0.##########"); // defining df as my own format
		
		System.out.println("sqrt("+input+") = " + df.format(result)); // print result

		return;

	}


	public static void main(String[] args){

		if(args.length != 1){ // check if inputs match
			System.out.println("Run program as follow: \n java .\\sqrt <input>");
			return;
		}
		

		// currently not working

		/*if(!(Integer.parseInt(args[0]))) { // check if input is a number
			System.out.println("Run program as follow: \n java .\\sqrt <input>");
			return;
		}*/

		double input = Double.parseDouble(args[0]); // declare args from command to variable


		calcroot(input); // call custom sqrt method

		return;
	}
}