import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        String[] originalArray=new String[]{"First","Second","Third"};
        var originalList = Arrays.asList(originalArray);

        originalList.set(0,"one");
        System.out.println("List: " + originalList);
        System.out.println("Array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("Arrays: " + Arrays.toString(originalArray));

        //originalList.remove(0);//can not remove element
        //originalList.add("fourth"); // not possible

        List<String> newList = Arrays.asList("Sunday","Monday","Tuesday");
        System.out.println(newList);

    }
}
