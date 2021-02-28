package CalculateElectricityBills;

public class properties1 //this is class
{
	public static String opener = "";
	
	public void setopener(String opener)
	{
		properties1.opener = opener;
	}
	
	public static String getopener()
	{
		System.out.println("Welcome to Electricity Machine!");
		return properties1.opener;
	}
	
	private double billpay;	
	
	public void setbillpay(double billpay)	//this is encapsulation	
	{
		this.billpay = billpay;
	}
	
	public double getbillpay()	//this is encapsulation
	{
		return this.billpay;
	}
	
	public properties1()	//this is constructor
	{
		this.billpay = 0;
	}
	
	public void setbillpay(int billpay)	//this is overloading	
	{
		this.billpay = billpay;
	}
	
	int units;	//this is variable
	
	public properties1(int units)  //this is constructor
	{ 	
		//this is conditional					
		if(units <= 100)
		  billpay = (units*1467)+(units*1467*0.1);
		
		else if(units <= 300)
		  billpay = (units*1467)+(units*1467*0.2);
		
		else if(units > 300)
		  billpay = (units*1467)+(units*1467*0.3);
	}

}
