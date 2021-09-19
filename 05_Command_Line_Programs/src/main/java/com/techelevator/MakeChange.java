package com.techelevator;
import java.util.Scanner;
/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */

public class MakeChange {

public static void main(String[] args) {
	Scanner userInput = new Scanner(System.in);

	//Prametmeters

	System.out.println("Please enter the amount of the bill in Dollars and Cents:   ");
	double userInputTotal = Double.parseDouble(userInput.nextLine());
	//double totalBill = userInputTotal;

	System.out.println("Please enter the amount tendered in Dollars and Cents:   ");
	double userInputTendered = Double.parseDouble(userInput.nextLine());
	//double totalTendered = userInputTendered;

//	math in background
	double totalChange = (-userInputTotal+userInputTendered);

// return
	System.out.println("Your Change is $"+totalChange);

	}

}
