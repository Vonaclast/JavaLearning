public class OskarEn001_08 {

    public static void main(String[] args){
        int day = 5;

        String dayString = null; //had to declare as null otherwise there was an error that the variable man not be declared

        switch (day){
            case 1: dayString = "Monday";
            break;
            case 2: dayString = "Tuesday";
            break;
            case 3: dayString = "Wednesdax";
            break;
            case 4: dayString = "Thursday";
            break;
            case 5: dayString = "Friday";
            break;
            case 6: dayString = "Satursday";
            break;
            case 7: dayString = "Sunday";
            break;
        }

        System.out.println(dayString);
    }
}
