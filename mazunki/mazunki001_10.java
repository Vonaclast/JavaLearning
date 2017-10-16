class mazunki001_10 {

	static int hp = 100; //define hp for player, static since it's a one instance variable
	static int xp = 0; // define xp for player
	static boolean isAlive = true; // summon player maybe?
	
	public static void main(String[] args){

		do {
			hp = hp -1; // lose one hp per attack (equal to hp--;, but aesthetics)
			xp = xp + 12; // gain 12 xp per attack

			if (hp <= 0) { // check whether or not the player has life left
				isAlive = !true; // kill if hp is under or equal to 0 // !true = false for the keks
			}


		} while (isAlive); // as long as player is still alive

		System.out.println("You died."); // well player should also know he's dead
		System.out.println("Your current hp is: " + hp); // a reason as of why you died could be nice, hp is enough. 
		System.out.println("Your current xp is: " + xp); // a score :D


	}

}