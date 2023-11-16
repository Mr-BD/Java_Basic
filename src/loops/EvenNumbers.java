package loops;

import java.util.Scanner;

//Да се изведат на екрана четните числа от 1 - 20.
public class EvenNumbers {
    public static void printEvenNumbers(){
        int number = 2;
        System.out.println("Een numbers are: ");
        while (number <= 20){
            System.out.print(number + " ");
            number = number + 2;
        }

    }
    public static void main(String[] args) {
        printEvenNumbers();
    }
}
