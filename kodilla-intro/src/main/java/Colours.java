import java.util.Scanner;

public class Colours {
    public static String getColourSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select first letter (O-orange, R-red, Y-yellow, G-green):");
        String colour = scanner.nextLine().trim().toUpperCase();
        switch (colour) {
            case "O": return "orange";
            case "R": return "red";
            case "Y": return "yellow";
            case "G": return "green";
            default:
                System.out.println("No colour starting with given letter is available. Try again.");
        }
        return colour;
    }
}
