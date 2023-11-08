import java.util.Scanner;

//Напишете програма, която чете от конзолата дробно число и принтира цялата му част.
//Write a program that reads a fractional number from the console and prints its whole part.
public class Exercise_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put a number here: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println(doubleNumber);
        System.out.println((int)doubleNumber);
    }
}
