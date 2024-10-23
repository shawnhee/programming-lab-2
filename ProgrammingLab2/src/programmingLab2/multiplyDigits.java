/*
 Author's Name: Shawn Song-Yang Hee
 Matric Number: 227845
 Lab No: 2
 */

package programmingLab2;
import java.util.Scanner; 

public class multiplyDigits {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("Please enter a three digit number");//Prompt user to input a three digit number
		int value=input.nextInt(); //User inputs the number
		// Consequences if the input digit is other than three digit
		if (value>=1000 || value<100) {
			System.out.println("You have input value other than 3 digit, it is invalid, please rerun"); //Prompt if input is other than three digit
		}
		// If the input digit is three digit
		else {
			int firstDigit = value / 100 ; //Extract first value
			int secondDigit = value / 10 % 10; //Extract second value
			int thirdDigit = value % 10; //Extract third value
			int multipliedValue = firstDigit*secondDigit*thirdDigit; //Multiply the three digits together
			System.out.println("The digits you have input are: "+firstDigit+" ,"+secondDigit+" ,"+thirdDigit); //Display the digits user have input
			System.out.println("The multiplied value of those digits are: " + multipliedValue); //Show the multiplied value of the three digits
		}
	}
}
