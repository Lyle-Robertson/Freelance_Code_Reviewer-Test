import java.util.Scanner;


public class SayTheNumber {
	
	static String sentence = "";
	// Error messages
	static final String ERRORMESSAGE1 = "Your input number contains a 1 or more ";
	static final String ERRORMESSAGE2 = "\n\n***Make sure your input is correct and try again.***\n\n";
	
	// number unit name arrays
	static String[] unitsBelow20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
									 "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
									"Seventeen", "Eighteen", "Nineteen"};
	
	static String[] tens = {"", "" , "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
	
	static String[] largeUnits = {"", "Thousand ", "Million ", "Billion ", "Trillion "};
	
	
	// Method used to call main method
	// Keeping complexity as low as possible
	static void mainCaller() {
		main(null);
	}
	
	// method that converts each group of numbers passed into it into string
	public static String numToWords(long number){
		
        if (number == 0) {
        	
        	return "";
        }
        else if (number < 20) {
        	return unitsBelow20[(int)number] + " ";
        }
        else if (number < 100) {
        	// 4. 20/10 = 2, now we have the string 'one hundred and twenty'
        	// 5. 20%10 = 0 which is passed into numToWords and results in ""
        	return tens[(int)number / 10] + " " + numToWords(number % 10);
        }
        else {
        	// 2. 120/100 = 1, thus far we have gotten 'one hundred'
        	// 3. 120 % 100 = 20 which is passed into numToWords again
        	return (unitsBelow20[(int)number/100] + " Hundred "+numToWords(number % 100)).stripTrailing();
        }
    }
	
	// Method that will 'say' the entered number
	// breaks input number apart input groups of 3
	// the works alongside the numToWords function to convert each group into appropriate string value
	public static String sayTheNumber(long number) {
		
		String outputString = "";  
        int unitNameIndex = 0;
        
        if(number == 0) {
			return "Zero.";
		}
        
        // example number: 9120
        while (number > 0){
            if (number % 1000 != 0){
            	// 1. 9120%000 = 120 is passed into numToWords
            	// 9. 9%1000 = 9 which is passed into numberToWords results in the string 'Nine'
            	// 10. new unitNameIndex value is passed into largeUnits resulting in the string 'Thousand'
                outputString = numToWords(number % 1000) + largeUnits[unitNameIndex] + outputString;
            }
            // 7. increments unitNameIndex
            unitNameIndex ++;
            // 8. 9120 /= 1000 = 9
            // 11. 9 /= 1000 = 0 which breaks the loop
            number /= 1000;
        } 
        
        // 12. returns our completed string 'nine thousand one hundred and twenty'
        return outputString.stripTrailing();	
	}
	
	public static void main(String[] args) {
		 
		// Requesting user input
		System.out.println("Enter a number from 0 to 999,999,999,999,999 "
		 		+ "and i will attempt to read that out to you.\n"
		 		+ "!!!(Remember to not use any separators like commas or spaces)!!!\n\n");
		 
		try(Scanner input = new Scanner(System.in)){
			 
			// Storing input as 'inputString', a string type variable.
			// Making it easier to identify specific input errors and notify user to said error.
			// e.g if comma is found the user will be notified that a comma was found.
			String inputString = input.nextLine();
			 
			// Checking input for any separators ( commas , spaces , and points)
			if (inputString.contains(",")) {
				System.out.println(ERRORMESSAGE1 + "commas." + ERRORMESSAGE2);
				mainCaller();
			}
			else if (inputString.contains(".")) {
				System.out.println(ERRORMESSAGE1 + "points." + ERRORMESSAGE2);
				mainCaller();
			}
			else if (inputString.contains(" ")) {
				System.out.println(ERRORMESSAGE1 + "spaces." + ERRORMESSAGE2);
				mainCaller();
			}
			// checking if first character is zero
			else if (inputString.charAt(0) == '0') {
				System.out.println("Number cannot start with 0" + ERRORMESSAGE2);
				mainCaller();
			}
			// casting the string to float
			// this would be the last check.
			// tells us if the inputString contains any other none number char
			else {
				long number = Long.parseLong(inputString);
				// run method to say number
				// Display result from user input
				System.out.println(sayTheNumber(number));
			}
		}
		catch(NumberFormatException e) {
			System.out.println("\nNumber entered contains none number characters." + ERRORMESSAGE2);
		}
	}
}
