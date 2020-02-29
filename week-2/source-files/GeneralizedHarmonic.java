public class GeneralizedHarmonic
{
    public static void main(String[] args) {
        // gets the value of "n" and "r" from the command-line arguments sent in, which would be at index 0 and 1 of the args string array respectively.
        // Then the values are parsed as integers.
        double n = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);

        double numerator = 1.0;
        double denominator = 1.0;
        for(int i = 2; i <= n; i++)
        {

            double secondDenominator = Math.pow(i, r);
            double newDenominator = denominator * secondDenominator;
            numerator = (newDenominator/denominator * numerator) + (newDenominator/secondDenominator);
            denominator = newDenominator;
        }

        double result = numerator/denominator;

        if(n < 1)
        {
            result = 0;
        }

        System.out.println(result);
    }
}