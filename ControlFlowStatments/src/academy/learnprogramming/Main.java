package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
    hasSharedDigit(12,23);
    }
    public static boolean hasSharedDigit(int number1, int number2){
        if(number1 < 10 && number2 > 99) return false;
        return (number1/10==number2/10 || number1/10==number22%10 || number1%10==number2/10 || number1%10==number2%10);
    }
    }
}
