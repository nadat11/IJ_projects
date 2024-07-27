package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(125)); // return 8
    }

    public static int sumDigits(int number) {

        if (number < 10) {
            return -1;
        }

        int sum = 0;
         //125  ---> 125/10=12  ----> 12*10=120 ----> 125-120=5
        while(number > 0 ){
            //extract the least significant digit
            int digit = number % 10;
            //add digit to sum
            sum+=digit;
            //drop the least digit
            number /= 10; // number = number /10;
        }
        return sum;
    }

}
//        245/10 = 24.5, where 5 is remainder so digit = 5,
//
//        and sum = sum + digit => sum = 0+5 => sum = 5
//
//        again 24/10= 2.4 where 4 is remainder so digit = 4
//
//        and sum = 5+4
//
//        now 2/10 = 0.2 where 2 is remainder so digit = 2
//
//        and sum = 5+4+2 = 11

