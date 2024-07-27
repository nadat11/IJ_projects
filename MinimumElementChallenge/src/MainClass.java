import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = " +returnedMin);
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

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int el : array) { // procces every el in the array
            if (el < min) { // if el is smaller than min
                min = el;  // give the value to min
            }

        }
        return min;
    }
}
