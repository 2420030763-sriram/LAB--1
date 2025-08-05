import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept radius input
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate volume using the formula: Volume = (4/3) × π × r³
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Display result with cubic units
        System.out.printf("Volume of the sphere: %.2f cubic units\n", volume);
    }
}
