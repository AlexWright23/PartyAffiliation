import java.util.Scanner;

//Class partyAffiliation
//        main()
//        string = "D"
//        string = "R"
//        string = "I"
//        output "Please enter your party affiliation (D,R,I) "
//        input partyAffiliation
//        if partyAffiliation = D then
//        output "You get a Donkey!"
//        else if partyAffiliation = R then
//        output "You get an Elephant!"
//        else if partyAffiliation = I then
//        output "You get an Independent Man!"
//        else
//        output "Not a valid party entered."
//        return
//        endClass

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please chose your party affiliation: ");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");

        char choice = scanner.next().charAt(0);

        if (choice == 'D' || choice == 'd') {
            System.out.println("You get a Donkey!");
        } else if (choice == 'R' || choice == 'r') {
            System.out.println("You get an Elephant!");
        } else if (choice == 'I' || choice == 'i') {
            System.out.println("You get an Independent Person!");
        }
    }
}