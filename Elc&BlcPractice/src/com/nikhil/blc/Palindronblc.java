package com.nikhil.blc;

public class Palindronblc {
	
	public static boolean isPalindrom(int num)
	{
		int temp=num;
		int rev=0;
		while(num!=0)
		{
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(rev==temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
