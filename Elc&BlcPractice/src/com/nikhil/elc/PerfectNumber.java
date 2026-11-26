package com.nikhil.elc;

public class PerfectNumber {

	void main()
	{
		int num=Integer.parseInt(IO.readln("Enter number: "));
		boolean result= isPerfect(num);
		IO.println(result);
		
	}
	


public static boolean isPerfect(int num)
{
	int sum=0;
	int temp=num;
	
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
		}
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






















