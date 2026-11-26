package com.nikhil.blc;

public class TwistedPrime {

	public static boolean isPrime(int num)
	{
		int count=0;
	 
		
		for(int i=2; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		
			if(count==1)
			{
				return true;
			}
			else
			{
				return false;
			}
			
	
	
	}
		
}
	
	

