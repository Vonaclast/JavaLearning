public class OskarEnX1_01 {
    //Squirrel Logic


    public static void main(String[] args){

        //Test cases
        System.out.println(isSuccessful(35, "Monday"));
        System.out.println(isSuccessful(55, "Wednesday"));
        System.out.println(isSuccessful(20, "Saturday"));
        System.out.println(isSuccessful(70, "Sunday"));

        System.out.println("");

        System.out.println(isSuccessful2(35, "Monday"));
        System.out.println(isSuccessful2(55, "Wednesday"));
        System.out.println(isSuccessful2(20, "Saturday"));
        System.out.println(isSuccessful2(70, "Sunday"));

    }

    //first nest attempt

    public static Boolean isSuccessful(int cigars, String day){
        if(cigars>=40 && cigars <=60){
            return true;
        }
        else if(cigars>=40){
            if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
                return true;
            }
            else{return false;}

        }
        else{return false;}
    }

    public static Boolean isSuccessful2(int cigars, String day){
        if(cigars>=40){
            if(cigars<=60){return true;}

            else if(day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")){
                return true;
            }

            else{return false;}
        }
        else {return false;}
    }

}
