class mazunkix1_01 {

	boolean cigarParty(int number_of_cigars, boolean weekend){
		int min_cigars = 40;
		int max_cigars = 60;

		if (number_of_cigars > min_cigars){
			if (!weekend){
				if (number_of_cigars <= max_cigars){
					return true;
				}
				else {
					return false;
				}
			}
			else {
				return true;
			}
		}
	}


	public static void main(String[] args){
		int number_of_cigars = args[0];
		boolean weekend = args[1];

		System.out.println(cigarParty(number_of_cigars, weekend));
	}
}