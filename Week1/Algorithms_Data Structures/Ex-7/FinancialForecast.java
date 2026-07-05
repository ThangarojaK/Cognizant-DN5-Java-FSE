public class FinancialForecast {

    // Recursive method
    static double futureValue(double presentValue, double growthRate, int years) {

        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive call
        return (1 + growthRate) * futureValue(presentValue, growthRate, years - 1);
    }

    public static void main(String[] args) {

        double presentValue = 10000;
        double growthRate = 0.10;   // 10%
        int years = 5;

        double result = futureValue(presentValue, growthRate, years);

        System.out.println("Present Value = " + presentValue);
        System.out.println("Growth Rate = " + (growthRate * 100) + "%");
        System.out.println("Years = " + years);
        System.out.println("Future Value = " + result);
    }
}
