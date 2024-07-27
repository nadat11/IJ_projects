import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int n = arr.length;
        int newArray[] = new int[n+1];
        int value = 7;
        System.out.println("Old array: " + Arrays.toString(arr));

        for(int i = 0; i < n;i++){
            newArray[i] = arr[i];
        }
        newArray[n] = value;
        System.out.println("New array: " + Arrays.toString(newArray));
    }
}
