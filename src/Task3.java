import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        //Variables
        String partyAffiliation;
        String donkeyParty = "Donkey";
        String elephantParty = "Elephant";
        String personParty = "person";

        System.out.println("What is your party affiliation?(Enter donkey, elephant, or person)");

        if (scan.hasNextLine()){
            partyAffiliation = scan.nextLine();

            if (partyAffiliation .equalsIgnoreCase(donkeyParty)){
                System.out.println("You get a Democratic Donkey!");
            } else if (partyAffiliation .equalsIgnoreCase(elephantParty)) {
                System.out.println("You get a Republican Elephant!");
            } else if (partyAffiliation .equalsIgnoreCase(personParty)) {
                System.out.println("You get an Independent Person!");
            } else {
                System.out.println("Error. You must enter in the phrase donkey, elephant, or person!");
            }
        }
    }
}
