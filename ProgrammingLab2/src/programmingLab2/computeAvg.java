/*
 Author's Name: Shawn Song-Yang Hee
 Matric Number: 227845
 Lab No: 2
 */

package programmingLab2;
import java.util.Scanner;

public class computeAvg {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
	    System.out.println("To calculate average of 3 values:"); //User input first number
	    System.out.println("Your first value"); //User input first number
	    double numberOne = input.nextInt();
	    System.out.println("Your second value");//User input second number
	    double numberTwo = input.nextInt();
	    System.out.println("Your third value"); //User input third number
	    double numberThree = input.nextInt();
	    double average = (numberOne+numberTwo+numberThree) / 3; //System compute average of the three numbers
	    String finalValue = String.format(" %.2f", average); //Limit final value to 2 decimal places
	    System.out.println("Your average is  " + finalValue ); //Output average value
	}
}
