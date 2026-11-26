package com.nikhil.elc;

public class ArmstrongNumber {
void main()
{
	int num=Integer.parseInt(IO.readln("Enter number:"));
	boolean result=isArmstrong(num);
	IO.println(result);
}



public static boolean isArmstrong(int num)
{
	int count=0;
	int temp=num;
	int sum=0;
	while(num!=0)
	{ 
		num=num/10;
		count++;
	}
	num=temp;
	while (num!=0)
	{
		int digit=num%10;
		sum=(int)Math.pow(digit, count)+sum;
		num=num/10;
	}
	if(temp==sum)
	{
		return true;
	}
	else
	{
		return false;
	}
}

}

















