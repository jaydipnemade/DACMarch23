
import java.util.Scanner;

class FC {
    public static void main(String arg[]) {
        double f, c;
        Scanner A = new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch = A.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter  Fahrenheit temperature");
                f = A.nextDouble();
                c = (f - 32) * 5 / 9;
                System.out.println("Celsius temperature is = " + c);
                break;

            case 2:
                System.out.println("Enter  Celsius temperature");
                c = A.nextDouble();
                f = ((9 * c) / 5) + 32;
                System.out.println("Fahrenheit temperature is = " + f);
                break;

            default:
                System.out.println("please choose valid choice");
        }
    }
}