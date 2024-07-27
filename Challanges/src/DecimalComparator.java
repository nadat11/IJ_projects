public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        one = (int)(one*1000);
        two =(int)(two*1000);

        if(one == two) return true;
        return false;
    }
}
