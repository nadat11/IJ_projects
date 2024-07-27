package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        isEvenNumber(2);
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println("------------------------------------");
//
//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//                System.out.println("Count value is still " + count);
//                count++;
//            }
//
//        System.out.println("------------------------------------");
//
//        count = 1;
//        do{
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if(count > 100){
//                break;
//            }
//        }while(count != 6);


        //Make it also record the total number of even numbers it has found
        //and break once 5 are found
        //at the end display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int recordEvenNumbers = 0;

        while(number <= finishNumber){
            number ++; // FIRST make an increment not to finish in endless loop
            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            recordEvenNumbers++;
            if(recordEvenNumbers >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found " + recordEvenNumbers);
        }
    public static boolean isEvenNumber(int number){
        if(number % 2 == 0){
          //  System.out.println("Number is even.");
            return true;
        }
       // System.out.println("Number is odd.");
        return false;
    }

//    for(count = 1; count !=6; count ++){
//        System.out.println("Count value in for loop is "+ count);
//    }
    }

