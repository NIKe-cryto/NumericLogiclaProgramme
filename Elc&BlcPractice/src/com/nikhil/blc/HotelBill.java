package com.nikhil.blc;

public class HotelBill {
	
	public static double calculateTotalAmount(int days, double roomRate)
	{
		return roomRate*days;
	}
	
	public static double calculateDiscountAmount(int days,double totalAmount)
	{
		double discount=0;
	
		if(days>=10)
		{
			discount= 20;
		}
		else if(days>=5)
		{
			discount =10;
		}
		else if(days>=3)
		{
		discount= 5;
		}
		else if(days>=1)
		{
			discount =0;
		}
		
		
		    
		     return totalAmount-(totalAmount*discount/100);
		}
	}
		
	
	

