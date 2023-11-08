
// Да се напише програма за валутен калкулатор.
// Програмата получава вход от потребителя за 2 стойности - сума в лева, която ще се конвертира
// и валута към която ще се конвертира:(USD EUR, GBP).
//Да се използват следните стойности:
//USD = 0.54
//EUR = 0.51
//GBP = 0.43

import java.util.Scanner;

public class CurrencyCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------------------------------" + "\nInput a amount of BGN, and currency in witch you want to convert it: \n ");
        double bgn = scanner.nextDouble();
        System.out.println("Please type a currency: ");
        String currency = scanner.next();
switch (currency){
    case "USD":
        System.out.println("Your amount in this currency in USD is:  " + bgn * 0.54);
        break;
    case "EUR":
        System.out.println("Your amount in this currency in EUR is: " + bgn * 0.51);
        break;
    case "GBP":
        System.out.println("Your amount in this currency in GBP is: " + bgn * 0.43);
    default:
        System.out.println("Incorrect currency! ");
}

    }
}
