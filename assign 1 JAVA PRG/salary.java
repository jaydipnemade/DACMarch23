import java.util.Scanner;

public class salary {

    public static void main(String args[])

    {

        double Basic, Da, Ta, PA, Tax, Gross;

        // System.out.println("Enter Basic salary of the employee\n");
        // Scanner obj1 = new Scanner(System.in);

        // Basic = obj1.nextDouble();
        Basic = 10000.8989009;
        Da = 14 * Basic / 100;
        Ta = 5600.6778;
        PA = 7000.3443534546;
        Tax = 1.76 * Da / 100;
        Gross = Basic + Da + Ta + PA - Tax;

        System.out.println("The Gross salary of the employee is:" + Gross);
    }

}