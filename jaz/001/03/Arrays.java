/*
Declare an Array which holds 7 strings, the days of the week.

Make the console output "Today is Friday.".

and, on *the same line*, using another print method, "Tomorrow is Saturday.".

"Friday" must be an element of the array, **not** written straight in the print command.
*/
public class Arrays{
   public static void main(String[] args) {
      String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

      System.out.print("Today is " + days[5] + ".");
      System.out.println(" Tomorrow is " + days[6] + ".");
   }
}
