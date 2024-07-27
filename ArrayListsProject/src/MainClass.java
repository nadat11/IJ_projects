import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){ //konstuktor
        this(name,"DAIRY",1); // generated default contructor call first
    }
    @Override
    public String toString(){
        return String.format("%d %s in %s", count,name.toUpperCase(),type);
    }
}
public class MainClass {
    public static void main(String[] args) {
    GroceryItem[] grocerArray = new GroceryItem[3];
    grocerArray[0] = new GroceryItem("milk");
    grocerArray[1] = new GroceryItem("Apples", "PRODUCE",6);
    grocerArray[2] = new GroceryItem("Oranges", "PRODUCE",5);
    System.out.println(Arrays.toString(grocerArray));

    ArrayList objectList = new ArrayList();
    objectList.add(new GroceryItem("Butter"));
    objectList.add("Yogurt");

    ArrayList<GroceryItem> groceryList = new ArrayList<>();
    groceryList .add(new GroceryItem("Butter"));
    groceryList.add(new GroceryItem("milk"));
    groceryList.add(new GroceryItem("oranges", "PRODUCE",5));
    groceryList.set(0,new GroceryItem("apples","PRODUCE",6));
    groceryList.remove(1);
    System.out.println(groceryList);

    }
}
