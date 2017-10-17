public class OskarEn001_10 {

    public static void main(String[] args){
        int health = 100;
        int xp = 0;
        Boolean isAlive = true;

       //this method doesn't use the boolean which is otherwise unnecessary
        /* while(health > 0){
            //The player will attack the opponent
                xp += 12;
                health--;
        }*/

        while(isAlive){
            if(health >0){
                xp += 12;
                health--;
            }
            else{isAlive = false;}
        }

        System.out.println("You are dead. You gained " + xp + " experience");
    }
}
