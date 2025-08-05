import java.util.Scanner;

public class TotalEarningsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for morning shift earnings
        System.out.print("Enter morning shift earnings (in rupees): ");
        double morningShiftEarnings = scanner.nextDouble();

        // Take input for evening shift earnings
        System.out.print("Enter evening shift earnings (in rupees): ");
        double eveningShiftEarnings = scanner.nextDouble();

        // Calculate total earnings
        double totalDailyEarnings = morningShiftEarnings + eveningShiftEarnings;

        // Display the total earnings
        System.out.println("Total earnings for the day: ₹" + totalDailyEarnings);
    }
}
