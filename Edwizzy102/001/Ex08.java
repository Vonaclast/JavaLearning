package com.Vonclast;

public class Ex08 {
    public static void main(String[] args) {
        int day = 5;

        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        switch (day) {
            case 1:
                System.out.println(week[1]);
                break;
            case 2:
                System.out.println(week[2]);
                break;
            case 3:
                System.out.println(week[3]);
                break;
            case 4:
                System.out.println(week[4]);
                break;
            case 5:
                System.out.println(week[5]);
                break;
            case 6:
                System.out.println(week[6]);
                break;
            case 0:
                System.out.println(week[0]);
            default:
                System.out.println("Invalid day of week");
                break;
        }
    }
}
