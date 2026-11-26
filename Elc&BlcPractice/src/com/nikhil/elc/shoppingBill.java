package com.nikhil.elc;

import com.nikhil.blc.ShoppingDiscount;

public class shoppingBill {
	public static void main(String[] args)
	
	{
	
		String name=IO.readln("Enter Consumer Name:");
	double bill=Double.parseDouble(IO.readln("Enter Bill Amount:"));
	
	
	IO.println("---------Bill Summary----------");
	
	{
		IO.println("Customer Name : " + name);
		IO.println("Original : " + bill);
		
		double dis=ShoppingDiscount.ShoppingDis(bill);
		double discount=bill*(dis/100);
		
				IO.println("Discount :" +dis);
				IO.println("Total Payable amount : " + (bill-discount));
	}

}
}

