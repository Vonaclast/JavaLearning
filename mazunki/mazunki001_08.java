class mazunki001_08 {
	
	public static void main(String[] args){

		int day = 5;
		String DayOfTheWeek = "";

		switch(day){
			case 1: DayOfTheWeek = "Monday";
					break;
			case 2: DayOfTheWeek = "Tuesday";
					break;
			case 3: DayOfTheWeek = "Wednesday";
					break;
			case 4: DayOfTheWeek = "Thursday";
					break;
			case 5: DayOfTheWeek = "Friday";
					break;
			case 6: DayOfTheWeek = "Saturday";
					break;
			case 7: DayOfTheWeek = "Sunday";
					break;
		}

		System.out.println(DayOfTheWeek);

		return;
	}
}