public class SquirrelLogic {
    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if ((cigars <= 40 && cigars >= 60) || isWeekend) 
            {return true;}
        return false;
    }

    public static void main(String[] args) {
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, false));
        System.out.println(cigarParty(70, true));
    } 
}