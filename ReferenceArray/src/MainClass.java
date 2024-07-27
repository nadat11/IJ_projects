public class MainClass {
    public static void main(String... args) {
        System.out.println("Hello world");
        String[] splitString = "Hello World again".split(" ");
        printText(splitString);

        System.out.println("_".repeat(20));
        printText("Hello");

        System.out.println("_".repeat(20));
        printText("Hello","World" , "again") ;

        System.out.println("_".repeat(20));
        printText() ;

        String[] sArray = {"first" , "second", "third" ,"fourth"};
        System.out.println(String.join(",",sArray)); // variable os last arguments
    }

    private static void printText(String... textList){
        for(String t : textList){
            System.out.println(t);
        }
    }
}
