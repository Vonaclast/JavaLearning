public class DrivingTooFast {
	public static int caughtSpeeding(int speed, boolean isBirthday) {
        int lowSpeed = 60, highSpeed = 80;
        if (isBirthday) {
            lowSpeed += 5;
            highSpeed += 5;
        }

        if (speed <= lowSpeed) {
            return 0;
        } else if (speed > lowSpeed && speed <= highSpeed) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(60, false));
        System.out.println(caughtSpeeding(65, false));
        System.out.println(caughtSpeeding(65, true));
    }
}
