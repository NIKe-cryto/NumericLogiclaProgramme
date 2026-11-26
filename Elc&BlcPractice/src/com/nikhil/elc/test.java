package com.nikhil.elc;

public class test {

	void main()
	{
		int num=Integer.parseInt(IO.readln());
		    double sum=0;
			int temp=num;
			int totaldigit=getTotalDigitsCount(num);
	
while(num!=0)
{
	int digit=num%10;
	sum=sum+Math.pow(digit,totaldigit);
	num=num/10;
}

if(temp==sum)
{
	IO.println("Armstrong Number");
}
else
{
	IO.println("Not Armstrong number");
}
		
	
	
	
	}
	
	static int getTotalDigitsCount(int number)
	{
		int count=0;
		while(number!=0)
		{
			number=number/10;
			count++;
		}
		return count;
	}
}
