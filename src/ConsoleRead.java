import java.util.Scanner;

/*
Напишете програма, която чете от конзолата String и принтира Hello, my name is <въведеното име>
My favorite movie is "Mission impossible"
Write a program that reads from the String console and prints Hello, my name is <entered name>
My favorite movie is "Mission impossible"
*/
public class ConsoleRead {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("Hello, my name is " + str + "\nMy favorite movie is \"Mission impossible\"");

    }
}
