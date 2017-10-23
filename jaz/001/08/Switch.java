/*
Declare an integer, 5, called "day".

Create a switch statement in which each case represents a day of the week (1 is Monday, 2 is Tuesday, and so forth).

Print out to the console the name of the Day of the week based on the value of "day".

You **must** use a Switch statement, printing the consequence of a case.
*/
public class Switch
{
      public static void main(String[] args)
      {
            int day = 5;
            String dayOfweek;
            switch (day)
            {
               case 1: dayOfweek = "Monday";
                  break;
               case 2: dayOfweek = "Tuesday";
                  break;
               case 3: dayOfweek = "Wednesday";
                  break;
               case 4: dayOfweek = "Thursday";
                  break;
               case 5: dayOfweek = "Friday";
                  break;
               case 6: dayOfweek = "Saturday";
                  break;
               case 7: dayOfweek = "Sunday";
                  break;
               default: dayOfweek = "Invalid day of week number!";
                  break;
            }
            System.out.println("Based on the value, the day is " + dayOfweek + ".");
      }
}
