package academy.learnprogramming;

public class Main {

        public static void main(String[] args) {
            int newScore = calculateScore("Tim", 500);
            System.out.println("New score is: " + newScore);

            double centimeters = calcFeetAndInchesToCentimeters(6, -1);
            if (centimeters < 0.0) {
                System.out.println("Invalid parameters!");
            }
            calcFeetAndInchesToCentimeters(100);
            calculateScore(75);
            calculateScore();

        }

        public static int calculateScore(String playerName, int score) {
            System.out.println("Player " + playerName + " scored " + score + " points.");
            return score * 1000;
        }

        public static int calculateScore(int score) {
            System.out.println("Unnamed player scored " + score + " points.");
            return score * 1000;
        }

        public static int calculateScore() {
            System.out.println("Unnamed player no scored  points.");
            return 0;
        }

        //        if (feet >= 0) return feet * 30.48;
//        if (inches >= 0 && inches <= 12) return inches * 2.54;
//        return -1;
//    }
//    public static double calcFeetAndInchesToCentimeters( double inches) {
//        if (inches >= 0 ) return inches * 12;
//        return -1;
//    }
        public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
            if ((feet < 0) || (inches < 0 || inches > 12)) {
                System.out.println("Invalid feet or inche parameter!");
                return -1;
            }
            double centimeters = (feet * 12) * 2.54; // covert feet to centimeter first
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches= " + centimeters + " cm.");
            return centimeters;

        }

        public static double calcFeetAndInchesToCentimeters(double inches) {
            if (inches < 0) {
                return -1;
            }
            double feet = (int) inches / 12;
            double remInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remInches + " reminder.");
            return calcFeetAndInchesToCentimeters(feet , remInches);
        }
    }
