
public class CI {
    public static void main(String args[]) {
        double p, r, t, Ci;
        p = 5;
        r = 10.75;
        t = 5;
        System.out.printf(
                "The Principle amount in Cr is  %f \nThe interest rate is %f \nThe time period in years is %f ", p, r,
                t);
        Ci = p * (Math.pow((1 + r / 100), t)) - p;
        System.out.println("\nThe Compound Interest in Cr is: " + Ci + "Cr");
    }
}