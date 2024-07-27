import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter a number");
        boolean hasNextInt = scanner.hasNextInt();

        int sum = 1;
        while (count <= 10) {

            if (hasNextInt) {
                System.out.println("Enter a number x# " + count);
            } else {
                System.out.println("Invalid number");
            }
            int sumAdd = scanner.nextInt();
            sum += sumAdd;
            scanner.nextLine();

            count++;

        }

        System.out.println("Sum of all entered numbers is: " + sum);

        scanner.close();
    }
}
