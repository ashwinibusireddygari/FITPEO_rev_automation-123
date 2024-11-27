package Sample;

public class StringOperations {

    public static void main(String[] args) {
        // Check if a string is passed as a command line argument
        if (args.length > 0) {
            String inputString = args[0];
            
            // Display the length of the string
            System.out.println("Length of the string: " + inputString.length());
            
            // Convert the string to uppercase
            String upperCaseString = inputString.toUpperCase();
            System.out.println("String in uppercase: " + upperCaseString);
            
            // Check if the string is a palindrome
            if (isPalindrome(inputString)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        } else {
            System.out.println("Please provide a string as a command line argument.");
        }
    }

    // Method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
