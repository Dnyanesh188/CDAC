import java.util.Scanner;

public class LeapS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Create a switch expression based on leap year conditions
        String isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap" : "Not Leap";

        // Use switch to determine if the year is a leap year
        switch (isLeapYear) {
            case "Leap":
                System.out.println(year + " is a leap year.");
                break;
            case "Not Leap":
                System.out.println(year + " is not a leap year.");
                break;
        }

        scanner.close();
    }
}



