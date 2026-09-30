import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // intialize variables and scanner object
        Scanner userInput = new Scanner(System.in);
        String partyAffiliation = "";

        //ask question and set affilliation accordingly
        System.out.print("What is your party affiliation(R, D, I, O): ");
        partyAffiliation = userInput.nextLine();

        //Simple if else if else structure to output correct part affilliation based on input
        if (partyAffiliation.equals("R")) {
            System.out.println("You get a Republican elephant!");
        }
        else if (partyAffiliation.equals("D")) {
            System.out.println("You get a democratic donkey!");
        }
        else if (partyAffiliation.equals("I")) {
            System.out.println("You get an independent person");
        }
        else if (partyAffiliation.equals("O")) {
            System.out.println("You get an ambiguous other!");
        }
        else {
            System.out.println("Invalid input: " + partyAffiliation);
        }

    }
}