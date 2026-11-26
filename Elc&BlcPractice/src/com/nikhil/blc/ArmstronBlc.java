package com.nikhil.blc;

public class ArmstronBlc {
	
	public static boolean isArmstrong(int num)
	{
		int count=0;
		int sum=0;
		int temp=num;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
	    num=temp;
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+(int) Math.pow(digit, count);
			num=num/10;
		}
		if(sum==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
