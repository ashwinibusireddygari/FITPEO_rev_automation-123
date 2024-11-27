package Sample;

import java.util.Scanner;

public class MonthName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number between 1 and 12
        System.out.println("Enter a number between 1 and 12:");

        // Read the user input
        int monthNumber = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Determine the month name based on the number entered
        String monthName;
        switch (monthNumber) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
            default:
                monthName = "Invalid month number. Please enter a number between 1 and 12.";
                break;
        }

        // Display the month name
        System.out.println("The month is: " + monthName);
    }
}

	


