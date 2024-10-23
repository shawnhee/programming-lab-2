/*
 Author's Name: Shawn Song-Yang Hee
 Matric Number: 227845
 Lab No: 2
 */

package programmingLab2;
import java.util.Scanner; 

public class mileToKmConversion {
	public static void main(String[] args) {
		final double conversionValue = 1.6; // Set conversion 1 mile = 1.6 kilometers
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter a value in miles to convert it to Kilometers"); //Prompt user to input a value
		System.out.println ("Note: the formula for conversion is 1 mile = 1.6 kilometers");// Show user that 1mile=1.6km
		double mile=input.nextDouble(); //User will input desired value for conversion
		double converted = mile*conversionValue;  //System convert input value to kilometer
		String finalValue = String.format(" %.1f",converted); //Limit convert value to maximum 1 decimal places
		System.out.println(mile+" miles is equal to "+ finalValue + " kilometers"); //Final output
	}
}
