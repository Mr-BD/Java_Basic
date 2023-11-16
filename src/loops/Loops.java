package loops;

import java.util.Scanner;

public class Loops {

    public static void printNumbers(int n){
        int i = 1;
        while (i <= n){
            System.out.print(i + " ");
            i++;
        }
    }
//do-While loop
    public static void printNumbersDoWhile(int n){
        int num = 1;
        do{
            num++;
            System.out.println(num);
        }while (num < 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        printNumbers(n);
        printNumbersDoWhile(n);
   }

}
