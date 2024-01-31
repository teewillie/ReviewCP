import java.util.Scanner;

public class RoomsMeasure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompting the user (me) to provide the room's dimensions and other specifications
        System.out.println("Please furnish the LENGTH of the room in feet:");
        double length = scanner.nextDouble();

        System.out.println("Please furnish the WIDTH of the room in feet:");
        double width = scanner.nextDouble();

        System.out.println("Please furnish the HEIGHT of the room in feet:");
        double height = scanner.nextDouble();

        System.out.println("Kindly inform the QUANTITY of windows present:");
        int numWindows = scanner.nextInt();

        System.out.println("Kindly inform the QUANTITY of doors present:");
        int numDoors = scanner.nextInt();

        // Computing the total area to be painted
        double ceilingArea = length * width;
        double wallArea = 2 * height * (length + width);
        double windowsArea = numWindows * 15; // Presuming each window occupies 15 sq ft
        double doorsArea = numDoors * 21; // Presuming each door occupies 21 sq ft

        double totalArea = ceilingArea + wallArea - windowsArea - doorsArea;

        // Determining the required amount of paint in gallons and quarts
        int gallonsNeeded = (int) Math.ceil(totalArea / 350); // 1 gallon covers about 350 sq ft
        double remainingArea = totalArea % 350;
        double quartsNeeded = remainingArea / 350 * 4; // 1 gallon = 4 quarts

        // Displaying the result FINALLLLY!!
        System.out.printf("For the embellishment of the room, you shall necessitate %d gallons and %.2f quarts of paint\n", gallonsNeeded, quartsNeeded);
    }
}
