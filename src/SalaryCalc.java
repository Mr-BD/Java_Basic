import java.util.Scanner;

/*
Напишете програма, коятo изчислява месечната заплата на един работник.
Програмата дефинира 3 променливи - дната за чистата заплата (без бонуси),
една за размера на бонуса и още една за броя продажби, направени от работника за един месец.
Ако продажбите са повече от 100, работникът получава бонус към заплатата.
*/

public class SalaryCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your salary is ?: ");
        double salary = scanner.nextDouble();       //Salary without bonus.
        System.out.println("Bonus amount is ?: ");
        double bonus = scanner.nextDouble();        //Amount of bonus.
        System.out.println("How many sells do you have?: ");
        int sellsBonus = scanner.nextInt();
        if (sellsBonus > 100) {
            double salaryPlusBonus = salary + bonus;
            System.out.println("Final salary is: " + salaryPlusBonus);
        }else {
            System.out.println("You don't have to much sells :( ");
        }
    }

}
