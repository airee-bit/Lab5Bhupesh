import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        int birthMonth;

        System.out.println("Enter in your birth month: ");

        if (scan.hasNextInt()){
            birthMonth = scan.nextInt();

            if (birthMonth > 0 && birthMonth <= 12){
                System.out.println("Your birth month is: " + birthMonth);
            }
            else {
                System.out.println("Error. You entered an incorrect month value: " + birthMonth);
            }
        } else {
            System.out.println("Error. You have entered a phrase or a decimal.");
        }
    }
}
