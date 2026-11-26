package com.nikhil.elc;

import com.nikhil.blc.HotelBill;

public class Hotel {
	public static void main(String[] args)
	{
	String name=IO.readln("Enter Cunsomer Name:");
	String hotelname=IO.readln("Enter Hotel Name:");
	double roomrate=Double.parseDouble(IO.readln("Enter Room Rate per days:"));
	int daysSt=Integer.parseInt(IO.readln("Enter Number of Days Stayed:"));
	
	IO.println("-----------Hotel Booking Summary------------");
	IO.println("Customer name : " + name);
	IO.println("Hotel Name : " +hotelname);
	IO.println("Room rate (Per Day) : "+ roomrate);
	IO.println("Days Stayed :" +daysSt) ;
	
	
	double totalamount= HotelBill.calculateTotalAmount(daysSt,roomrate );
	IO.println("Total Amount: " +totalamount);
	double discount=HotelBill.calculateDiscountAmount(daysSt, totalamount);
	IO.println("Amount After Discount :"+ discount);
	
	
	
	
	
	
	}

}
