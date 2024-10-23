/*
 Author's Name: Shawn Song-Yang Hee
 Matric Number: 227845
 Lab No: 2
 */

package programmingLab2;
import java.util.Scanner; 

public class meterToFeetConversion {
	public static void main(String[] args) {
		final double conversionValue = 3.2786; // Set conversion 1 meter = 3.2786 feet
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter a value in meters to convert it to feet");//Prompt user to input a value for conversion
		double meter=input.nextDouble(); //User will input desired value for conversion
		double converted = meter*conversionValue;  //System convert value to feet
		String finalValue = String.format(" %.4f",converted); //Limit convert value to 4 decimal places
		System.out.println(meter+" meters is equal to "+ finalValue + " feet "); //Final output that is converted to feet
	}
}
