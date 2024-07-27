package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }


    public static boolean isOdd(int number) {
        if (number < 0) return false;
            if (number % 2 == 1) {  //number % 2 != 0    EVEN 2*n   ODD 2*n+1
                return true;
            }
        return false;
    }

        public static int sumOdd ( int start, int end){
            int sum = 0;
            if(end < start || start < 0 || end < 0) {
                return -1;
            }
                for (int i = start; i <= end ; i++){

                    if(isOdd(i))
                        sum = i + sum;
                } return sum;

            }
        }

