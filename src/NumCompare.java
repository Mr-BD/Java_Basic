import java.util.Scanner;
//import static java.lang.System.out;

//Напишете програма , която чете две числа от конзолата A и B.
// Принтирайте в конзолата: "A is bigger then B" ако A е по-голямо от B, или "A is smaller then B", ako A е по-малко от B.
public class NumCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int a = scanner.nextInt();
        System.out.println("Enter number B: ");
        int b = scanner.nextInt();
        String strComparison = (a>b) ? "A is bigger then B" : "A is smaller then B";
        System.out.println(strComparison);

    }
}
