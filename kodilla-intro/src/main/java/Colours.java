import java.util.Scanner;

public class Colours {
    public static String getColourSelection() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select first letter (O-orange, R-red, Y-yellow, G-green):");
        String colour = scanner.nextLine().trim().toUpperCase();
        switch (colour) {
            case "O": return "Orange";
            case "R": return "Red";
            case "Y": return "Yellow";
            case "G": return "Green";
            default:
                System.out.println("No colour starting with given letter is available. Try again.");
        }
        return colour;
    }
}
