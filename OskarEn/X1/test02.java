public class test02 {

    public static void main(String[] args){
        System.out.println(caughtSpeeding(caughtSpeeding(65, true));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));


    }

    public static int caughtSpeeding(int speed, boolean birthday){

        //checking add apply the extra 5 allowed on birthday makes the if else statments easier to do
        if(birthday){speed -= 5};
        else{}

        //here are the decisions and the fines
        if(speed<=60){return 0;}

        else if(speed>60){return 1;}

        else{return 2;}
    }
}