public class BarkingDog {
        public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
            if(hourOfDay < 0 || hourOfDay > 23) { // to check if the hourOfDay parameter is within range of 0-23
                return false;
            }
            else if(barking && (hourOfDay < 8 || hourOfDay > 22)) { //If it is within range, then check if dog is
                // barking and at the same time if its before 8 or after 22
                return true;
            } else {
                return false; //If not i.e. it is between 8 - 22 it becomes false.
            }
        }
    }


