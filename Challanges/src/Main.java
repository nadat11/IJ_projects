public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim" , 500);
        System.out.println("Tims new score is: " + newScore);

        double miles = SpeedCoverter.toMilesPerHour(10.5);
        System.out.println("Miles = " + miles);

        SpeedCoverter.printConversion(10.5);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        boolean dog = BarkingDog.shouldWakeUp(true, -1);
        System.out.println(dog);

        boolean year = LeapYear.isLeapYear(1800);
        System.out.println(year);

        boolean param = (Boolean) DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println(param);

        boolean equal = EqualSumChecker.hasEqualSum(1, -1, 0);
        System.out.println(equal);

        boolean teen = TeenNumberChecker.hasTeen(9, 10, 99);
        System.out.println("Teen is: " + teen);

        boolean teen2 = TeenNumberChecker.isTeen(7);
        System.out.println("Teen2 is: " + teen2);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;

    }
}
