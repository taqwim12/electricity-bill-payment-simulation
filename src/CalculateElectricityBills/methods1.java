package CalculateElectricityBills;

import java.util.Scanner; //this is scanner
import java.util.Random;  //this is added feature

public class methods1 extends properties1 //this is inheritance 
{	
	public methods1(int units) 
	{
		super(units);
	}
	
	public static String getopener() //this is overriding
	{
		System.out.println("Hi, Welcome to Electricity Bill Paymeny Machine!");
		
		return properties1.opener;
	}
	
	public static void main(String args[])
	{
		String validation = "";
		
		Scanner scan = new Scanner(System.in);	//this is scanner
		
		String[] arr= {"C101","C102","C103"};	//this is array
		
		 do 
		 { 
			int units; 
			
			System.out.println(getopener() + "Enter the Amount of Purchases of Electricity (kWh) = ");
			
			units = scan.nextInt();
			
			methods1 p = new methods1(units);	//this is object
			
			System.out.println("Amount to be paid :" + " Rp. " + p.getbillpay() );
			
			Random rd = new Random();
			
			int i = rd.nextInt(3);
			
			System.out.println("Please pay at the cashier : " + arr[i]);
			
			System.out.println("Give this payment code to the employee at the cashier : " + rd.nextInt(123456));
			
			System.out.println("With amount to be paid = Rp. " + p.getbillpay()); 
			
			System.out.println("Do you want to repeat the purchase?(y for yes / n for no)");
			
			validation = scan.next();
			
		 switch (validation) {	//this is looping
         case "n":
         case "N":
         System.out.println("Thank You! :)");	
         break;
     } 
		 
 } while (validation.equals("y") || validation.equals("Y"));	//this is part of looping
		 
}
	
} 