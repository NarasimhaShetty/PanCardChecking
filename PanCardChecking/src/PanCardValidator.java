import java.util.Scanner;

	public class PanCardValidator {

	    public static boolean isValidPANCard(String pan) {
	        // Check if the input string is null or empty
	        if (pan == null || pan.isEmpty()) {
	            return false;
	        }

	        // Check if the input string is of the expected length for a PAN card
	        if (pan.length() != 10) {
	            return false;
	        }

	        // Check if the input string matches the expected pattern for a PAN card
	        String pattern = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
	        if (!pan.matches(pattern)) {
	            return false;
	        }

	        // If all checks pass, then the input string is a valid PAN card number
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter PAN card numbers (separated by commas): ");
	        String input = scanner.nextLine();
	        String[] pans = input.split(",");

	           for (String pan : pans) {
	            pan = pan.trim();

	            if (isValidPANCard(pan)) {
	                System.out.println(pan + " is a valid PAN card number");
	            } else {
	                System.out.println(pan + " is not a valid PAN card number");
	            }
	        }

	        scanner.close();
	    }
	}
