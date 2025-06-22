
public class Main {

    // Recursive function to calculate future value
    public static double forecastValue(double currentValue, double growthRate, int years) {
        if (years == 0) {
            return currentValue;
        }
        return forecastValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double current = 1000.0;  // starting value
        double growthRate = 0.10; // 10% annual growth
        int years = 5;

        double future = forecastValue(current, growthRate, years);
        System.out.printf("Forecasted Value after %d years: %.2f\n", years, future);
    }
}

// Output
// Forecasted Value after 5 years: 1610.51
