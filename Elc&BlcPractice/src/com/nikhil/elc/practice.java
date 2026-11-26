package com.nikhil.elc;

public class practice {
	public static void main(String arg[])
	{
		int num1=Integer.parseInt(IO.readln("Enter number1: "));
		int num2=Integer.parseInt(IO.readln("Enter number2: "));
	    prime(num1,num2);
	}
	public static void prime(int num1,int num2)
	{
		
		
		for(int num=num1; num<=num2; num++)
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
