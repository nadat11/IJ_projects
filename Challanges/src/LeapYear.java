public class LeapYear {
    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999) return false;
        if (year % 4 != 0) return false;
        if (year % 100 == 0) return year % 400 == 0;
        return true;
    }
}
//        If year is too small or too big, line 3 returns false.
//        Line 4, if the year is not evenly divisible by 4, it is not a leap year, return false.
//        Line 5, if the year is evenly divisible by 100, check to see if it is divisible by 400:
//        If it is or is not, return true or false (the result of year % 400 == 0 depending on value of year )
//        Line 6, return true if year is evenly divisible by 4 but not 100 and is thus a leap year.
//        NOTE:
//        The conditional on line 5 should only be executed if the year was evenly divisible by 4.
//        We do not need an else on line 5 because if the year is not evenly divisible by 4,
//        the function will have returned false already by virtue of line 4, and therefore
//        we don't have to worry about line 5 being errantly executed.
//        else essentially says, " If and only if, the preceding if conditional was not true, then try this one out ".