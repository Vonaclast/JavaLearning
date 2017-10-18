
public class DrivingTooFast {
	public static void main(String[] args) {
		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
	}
	/**
	 * Calculates what type of ticket (big, small or none). 
	 * 
	 * @param speed			speed
	 * @param birthday		birthday or not
	 */
	public static void caughtSpeeding(int speed, boolean birthday) {
		int smallTicket = 60;
		int bigTicket = 81;
		// special case: birthday
		if (birthday == true) {
			smallTicket = smallTicket + 5;
			bigTicket = bigTicket +5;
		}
		// ticket
		if (speed <= smallTicket) {
			System.out.println("0");
		} else if (speed < bigTicket) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
		
	}
}
