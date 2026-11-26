package com.nikhil.blc;

public class ShoppingDiscount {
	public static int ShoppingDis(double billAmount)
	{
		if(billAmount>=5000)
		{
			return 20;
		}
		else if(billAmount>=3000)
		{
			return 15;
		}
		else if(billAmount>=1000)
		{
			return 10;
		}
		else
		{
			return 5;
		}
	}
	

}
