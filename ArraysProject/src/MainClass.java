import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

        System.out.println(myDoubleArray[2]);

        int[] firstFiveNumbers = new int[]{1,2,3,4,5};

        int[] firstTen={1,2,3,4,5,6,7,8,9,10};
        System.out.println("First = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        // oduzeti jedan da bismo dobili poslednji index
        System.out.println("last element = "+firstTen[arrayLength -1]);

        int[] newArray;
        //newArray = new int[] {5,4,3,2,1};
        newArray =new int[5];// 0 0 0 0 0
        for(int i = 0; i< newArray.length; i++){
            newArray[i] = newArray.length -i;
        }
        for(int i = 0; i<newArray.length; i++){
            System.out.print(newArray[i] + " ");
        }

        System.out.println();
        for(int element : newArray){
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));

        //assign any array to an Object varable
        Object object = newArray; // integer array reference is assign to an object reference
        if(objectVariable instanceof int[]){ // instanceof tests if Object variable is instance of integer array
            System.out.println("Object variable is really an int array");
        }
        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;


    }
}
