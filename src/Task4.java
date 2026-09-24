import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        int age;

        System.out.println("Enter your age: ");

        if (scan.hasNextInt()) {
            age = scan.nextInt();

            if (age >= 21 && age <= 90) {
                System.out.println("You get a paper wristband!");
            } else {
                System.out.println("Error. You have entered something other than a valid age!");
                System.exit(0);
            }
        } else {
            System.out.println("Can't enter a phrase!");
        }
    }
}
