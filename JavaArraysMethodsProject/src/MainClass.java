import java.util.Arrays;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {

    int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10]; // zero filed array
        System.out.println("Second array " + Arrays.toString(secondArray));
        Arrays.fill(secondArray,5); // fill sets all element to 5
        System.out.println("Second array value 5 "+Arrays.toString(secondArray));

        int[] thirdArray =getRandomArray(10);
        System.out.println("Third array" + Arrays.toString(thirdArray));
        int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length);
        System.out.println("Fourth array " + Arrays.toString(fourthArray));

        System.out.println("Sorting: ");
        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallerArray = Arrays.copyOf(thirdArray,5);
        System.out.println("Small array copy: " + Arrays.toString(smallerArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 15);
        System.out.println("Larger array " + Arrays.toString(largerArray));

        // Linear searching
        String[] sArray = {"Able" , "Jane", "Mark","Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if(Arrays.binarySearch(sArray,"Mark") >= 0){  // BINARY SERACH ONLY WORKS ON SORTED ARRAY
            System.out.println("Found Mark in the list");
        }
        int[] s1 = {1,2,3,4,5};
        int[] s2 = {5,2,3,4,1};

        if(Arrays.equals(s1,s2)){ // ARRAYS.EQUALS CHECKS TYPE AND VALUE AT THE INDEX OF BOTH ARRAYS
             System.out.println("Arrays are equal.");
        }else{
            System.out.println("Arrays are not equal.");
        }


        //challengeS
        int[] decsArray = getRandomArray(5);
        System.out.println("Random array before sorting in desc: " + Arrays.toString(decsArray));

        System.out.println("Descending sort " + Arrays.toString(decsArray));

        int[] sortedArray = sortIntegers(new int[]{7,30,35});
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] getRandomArray(int len){
        Random random = new Random(); //Class in java.util
        int[] newInt = new int[len]; // creating a new array and seting the size that is passed as an argument

        for(int i=0; i<len; i++){ //assign to each element a random number
            newInt[i] = random.nextInt(100); //exclusive upper bound limit to the 100 max value
        }
        return newInt; // this new array is retuned up in the method name int[]

    }

    private static int[] sortIntegers(int[] array){

        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while(flag){
            flag=false;

            for(int i = 0; i< sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp=sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag =true;
                    System.out.println("---------->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }
        return sortedArray;


    }
}
