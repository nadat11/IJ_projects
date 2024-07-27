package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(252));
        //   System.out.println(isPalindrome(707));
        //  System.out.println(sumFirstAndLastDigit(101));
    }

//    public static boolean isPalindrome(int number) {
//        int reverse = 0;
//        int lastDigit;
//        int num = number;
//        while (num != 0) {
//            lastDigit = 0;
//            lastDigit = num % 10;
//            reverse *= 10;
//            reverse += lastDigit;
//            num /= 10;
//        }
//        if (reverse == number) {
//            return true;
//        } else
//            return false;
//    }
//    public static int sumFirstAndLastDigit(int number){
//        if (number < 0) {
//            return -1;
//        }
//
//        int lastDigit = number % 10;
//        while (number > 9) {
//            number /= 10;
//        }
//        return lastDigit + number;
//    }

    public static int getEvenDigitSum(int number) {
        int num = number;
        if(num < 0) return -1;
        int even = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit  % 2 == 0 ) {
                even += lastDigit;
            }
            num /= 10;
        }
        return even;
    }
}


//    To translate this to code using the second approach(text in bold), lets write the steps out first.
//        1) reverse the number
//        2) check if reverse is equal to original.
//
//        To translate this to java we need to know how to reverse a digit. Using what we learned so far in the course,
//        we learned about the % and / operators. We can use this to reverse the number. So lets say we want to reverse 123.
//        We know the reverse needs to look like 321. 321 is also same as 300 + 20 + 1. Do you see the pattern? A multiple of 10 each time. Using this ,
//
//        int temp = number;
//        int reverse = 0;
//        while(temp >0){
//        int current = temp % 10;
//        reverse  = current + reverse; <--- when we get to last digit we have 321 but because we multiple 10 next line
//        reverse = reverse * 10; <--- this results in 3210 instead of 321 at the final step.
//        what reverse will look like each step is this: reverse = (0 + 3 ) * 10,  reverse = (30+ 2) * 10, (320+1).
//        temp = temp/10;
//
//        }
//The reason we want to put the value of "number" into "num" is so we can only use "num" for testing. When we do the testing,
// the value of "num" will be changed every time we go through the loop.
//
//
//
//For example, if we wanted to test if the number 125 was a palindrome (which it isn't), then "number" will be equal to 125
// and then we use "num = number" which now makes "num" ALSO equal to 125.
//
//
//
//We ONLY use the "num" variable for testing in the loop, NOT "number". We want to only use the "number" variable at the
// end to compare it to "reverse". We don't use "number" in the loop because when we use "num", the value of "num" changes every time we go through the loop. If we used "number" in the loop instead, then the value of "number" will be changed and it won't match the same value that the user originally inputted.
// In other words, we want to preserve the original number that the user gave, so that's why we don't modify the "number" variable.
//        at this step we get 3210 <--- we need to divide by 10 to get 321
//        reverse = reverse/10;
//
//        Now all we have to do is check this reverse number which is 321 if it equals to 123.
//        In this case its false. To check if same we just use == to compare.