package com.nikhil.elc;

import com.nikhil.blc.TwistedPrime;

public class PrimeElc {

	
	public static void main(String[] args)
	{
		int num=Integer.parseInt(IO.readln("Enter number: "));
		
		int temp=num;
		int rev=0;
	while(temp!=0)
	{
		int digit=temp%10;
		rev=rev*10+digit;
		temp=temp/10;
		
	}
	
	boolean result1=TwistedPrime.isPrime(num);
	boolean result2=TwistedPrime.isPrime(rev);
	
	
	if(result1&&result2)
	{
		IO.println(num  +" is Twisted Prime");
	}
	else
	{
		IO.println(num+" is Not Twisted Prime");
	}
	}
}
