import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Variables
        double priceCost = 0;
        double shippingTax = 0.02;
        double totalCost;

        System.out.println("Enter the price of your item");

        if (scan.hasNextDouble()) {
            priceCost = scan.nextDouble();

            if (priceCost < 0) {
                System.out.println("Error.Invalid data type");
                System.exit(0);
            }

            if (priceCost >= 100) {
                System.out.println("Your Shipping is free!");
                System.out.println("Total price including free shipping is: $ " + priceCost);
            } else if (priceCost < 100 && priceCost >= 1 ) {
                totalCost = (priceCost + (priceCost * shippingTax));
                System.out.println("Your shipping cost is :$ " + priceCost * shippingTax);
                System.out.println("Your total price including shipping cost is: $ " + totalCost);
            }
        } else {
            System.out.println("Error. You have entered a phrase!");
        }
    }
}
