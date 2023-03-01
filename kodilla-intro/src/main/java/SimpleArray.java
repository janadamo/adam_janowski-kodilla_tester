public class SimpleArray {
    public static void main(String[] args) {
        String[] planes = new String[5];
        planes[0] = "Boeing";
        planes[1] = "Airbus";
        planes[2] = "Bombardier";
        planes[3] = "Falcon";
        planes[4] = "Embraer";

        int numberOfElements = planes.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementow.");
    }
}
