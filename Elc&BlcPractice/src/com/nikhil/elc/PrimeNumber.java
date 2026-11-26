package com.nikhil.elc;

public class PrimeNumber {
	void main()
	{
		int n1=Integer.parseInt(IO.readln("Enter n1:"));
		int n2=Integer.parseInt(IO.readln("Enter n2:"));
		Prime(n1,n2);
	}
	
	public static void Prime(int n1, int n2)
	{
	   
		for(int num=n1; num<=n2; num++)
		{
			int count=0;
			for(int i=1; i<=num; i++)
			{
			    if(num%i==0)
			{
				count++;
			}
		
		}
		
		if(count==2)
		{
			
		IO.print(num+" ");
			
		}
		}
	}
}

	
	
	
	
	
	
	


























