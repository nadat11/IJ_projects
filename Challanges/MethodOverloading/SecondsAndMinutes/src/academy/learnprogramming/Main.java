package academy.learnprogramming;

public class Main {
    private static final String INVALID_VALUE = "Invalid value!";

    public static void main(String[] args) {

        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945L));

        System.out.println(area(0));
        System.out.println(area(5.0, 4.0));

        printYearsAndDays(561600);

        printEqual(1, 2, 3);

        System.out.println(isCatPlaying(true, -25));

    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return INVALID_VALUE;
        }
        long hours = minutes / 60;
        long remainigMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = remainigMinutes + "m";
        if (remainigMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }

    private static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE;
        }
        long minutes = seconds / 60;
        long remaingSeconds = seconds % 60;
        String x = getDurationString(minutes, remaingSeconds); // NE VRACAMO METOD VEC SAMO VREDNOST IZ METODA!!!!!!
        return x;
    }

    public static double area(double radius) {
        double area = 0;
        if (radius < 0) {
            return -1;
        } else {
            return area = radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y) {
        double area = 0;
        if (x < 0 || y < 0) {
            return -1;
        } else {
            return area = x * y;
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value!");
        } else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainigDays = days % 365;

            System.out.println(minutes + " min" + " = " + years + " y" + " and " + remainigDays + " d");
        }
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a == b && b == c && a == c) {
            System.out.println("All numbers are equal");
        } else if (a != b && b != c && a != c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

   //return temperature > 24 && temperature < 46 && summer || temperature > 24 && temperature < 36;

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(summer)return temperature>=25 && temperature<=45;
        return temperature>=25 && temperature<=35;
    }
}


