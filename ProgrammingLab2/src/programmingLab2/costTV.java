/*
 Author's Name: Shawn Song-Yang Hee
 Matric Number: 227845
 Lab No: 2
 */

package programmingLab2;
import java.util.Scanner; 

public class costTV {
	public static void main(String[] args) {
		final double salesTax = 1.08; // Set sales tax as 8%
		Scanner input = new Scanner(System.in);
		System.out.println ("Please enter the original price of your TV in RM:");//Prompt user to input the original price of their TV
		double price=input.nextDouble(); //User will input their original price of their TV
		double finalPrice = price*salesTax;  //System will calculate final price after including sales tax
		String priceInTwoDecimalPlaces = String.format("RM%.2f",finalPrice); //To set price in RM and in 2 decimal places
		System.out.println("The cost of the TV you paid with sales tax is: "+ priceInTwoDecimalPlaces); //Output final price in RM and two decimal places
	}
}
