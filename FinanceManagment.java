import java.util.Scanner;

public class FinanceManagment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();
        final double MONTHLY_RATE = 0.05 / 12;

        for (int i = 1; i <= 6; i++) {
            double accountValue = calculateAccountValue(monthlySaving, i, MONTHLY_RATE);
            System.out.printf("Month %d: %.2f%n", i, accountValue);
        }
    }

    /**
     * Method to calculate the account value after a certain number of months using recursion.
     *
     * @param monthlySaving the amount saved per month
     * @param months        the number of months
     * @param monthlyRate   the monthly interest rate
     * @return the account value after the specified number of months
     */
    private static double calculateAccountValue(double monthlySaving, int months, double monthlyRate) {
        if (months == 0) {
            // Base case: when there are no months left, return the initial account value
            return monthlySaving;
        } else {
            // Recursive case: calculate account value for previous month and add interest for current month
            double previousAccountValue = calculateAccountValue(monthlySaving, months - 1, monthlyRate);
            return previousAccountValue * (1 + monthlyRate);
        }
    }
}
