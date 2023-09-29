import java.util.Scanner;

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