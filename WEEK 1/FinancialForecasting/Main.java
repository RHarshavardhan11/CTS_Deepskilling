import java.util.Scanner;

public class Main {

    public static double futureValue(double currentValue, double growthRate, int years) {

    if (years == 0) {
        return currentValue;
    }

    double nextValue = currentValue * (1 + growthRate);

    return futureValue(nextValue, growthRate, years - 1);
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Value: ");
        double currentValue = sc.nextDouble();

        System.out.print("Enter Annual Growth Rate: ");
        double growthRate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(currentValue, growthRate / 100, years);

        System.out.printf("Future Value after %d years = %.2f%n", years, result);

        sc.close();
    }
}