import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter moungt");
        int mounght = sc.nextInt();
    switch (mounght){
        case 1:
            System.out.println("Monday");
        break;

            case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wendsday");
            break;
        default:
            System.out.println("this is the end!");
    }

    }
}
