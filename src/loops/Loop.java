package loops;

import java.util.Scanner;

public class Loop {

    public static void printNumbers(int n){
        int i = 1;
        while (i <= n){
            System.out.print(i + " ");
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        printNumbers(n);
   }

}
