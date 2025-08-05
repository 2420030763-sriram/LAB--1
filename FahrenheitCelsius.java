
public class FahrenheitCelsius {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

        // Accept temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");
        double temperatureFahrenheit = scanner.nextDouble();

        // Convert Fahrenheit to Celsius using the correct formula
        double temperatureCelsius = (5.0 / 9.0) * (temperatureFahrenheit - 32);

        // Display the converted temperature with units
        System.out.printf("Temperature in Celsius: %.2f°C\n", temperatureCelsius);
    }
}









