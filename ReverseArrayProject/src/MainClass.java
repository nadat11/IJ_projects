import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

//        reverse(returnedArray);
//        System.out.println("Final: " + Arrays.toString(returnedArray));
        int[] reversedCopy = reverseCopy(returnedArray);
        System.out.println("After reverse " +Arrays.toString(returnedArray));
        System.out.println("reverseCopy " + Arrays.toString(reversedCopy));


    }

    private static int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas: ");
        String input = scanner.nextLine();

        String[] splits = input.split(","); // comma delimited
        int[] values = new int[splits.length]; // from array of Strings make array of integers

        //now we need to parse each of the strings into integer and add each to the integer array

        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim()); // ()trim uklanja space-ove
        }

        return values;
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halflenght = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            int temp = array[i]; // assing array el to temp variable, we move one element
            array[i] = array[maxIndex - i]; // assign another element at other end to array[i], then we set to the element we want to swap it with
            array[maxIndex - i] = temp; // assign temp to other end array, we then set the second element to the value temp variable
            System.out.println("--->" + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) { //method gets parameter array
        int[] reversedArray = new int[array.length];  // it creates new arrays same length as parameter
        int maxIndex = array.length - 1; // assignes to max last index
        for (int el : array) { // loops trought elements
            reversedArray[maxIndex--] = el; // populates the reversedArray seting the last element in the new array
                                            // to the first element in the array passed to this method
            //Only after maxIndex is used to access the last element of reversedArray, does it get decremented.
            // To be clear, the decrement of maxIndex, occurs after the assignment is completed.
        }
        return reversedArray;
    }
}
