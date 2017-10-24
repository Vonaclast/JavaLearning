/*
Declare the following variables with the related value:

health, 100;
xp, 0;
isAlive, true.

Logics of the program:

The player starts with 100 health points.
When the player's health reaches 0, the game is over (isAlive = false).

The player, if he has a health of 1 or more, will attack the enemy monster: attacking implies the player **gains** 12 experience points (xp), and **loses** 1 health point.

Using the above logic, when the health reaches 0, print to the console: "You are dead. You gained * experience".

You **must** output the experience value using the xp variable.
*/
public class BasicGame
{
   public static void main(String[] args)
   {
         int health = 100;
         int xp = 0;
         boolean isAlive = true;
         int attackCounter = 0;

         while(health > 0)
         {
            health--;
            xp+=12;
            System.out.println(
            "Player Attacks!" + "\n" +
            "Health: " + health + "%" + "\n" +
            "XP: " + xp + "\n");

            attackCounter++;
         }

         if(health == 0) {isAlive = false;}

         System.out.println("You are dead. You gained " + xp + " points. You attacked " + attackCounter + " times.");


   }
}
