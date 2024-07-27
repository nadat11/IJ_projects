package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
       int newScore = caluclateScore("Nada" , 500);
        System.out.println("New score is " + newScore);

        caluclateScore(75);
        caluclateScore();

        double centimeters = calcFeetAndInchesToCentimeters(6, -1);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters!");
        }
        calcFeetAndInchesToCentimeters(157);
    }

    public static int caluclateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int caluclateScore( int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
    public static int caluclateScore(){
        System.out.println("No player no score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameter!");
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
        double remainigInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " +remainigInches  + " reminder.");
        return calcFeetAndInchesToCentimeters(feet , remainigInches);
    }
}
