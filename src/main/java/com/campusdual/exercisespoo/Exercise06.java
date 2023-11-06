package com.campusdual.exercisespoo;

import java.util.Calendar;

public class Exercise06 {

    // comprobar cual es la estacion del año
    // comprobar sdi es de mañana, de tarde o de noche

    public static String checkSeason(int month) {
        String season = "";
        switch (month + 1) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Autumn";
                break;
            default:
                season = "Month must be 0-11";
                break;
        }
        return "";
    }

    public static void checkHour (int hour) {
        switch (hour) {
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
        }
    }

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int month = cal.get(Calendar.MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
    }
}
