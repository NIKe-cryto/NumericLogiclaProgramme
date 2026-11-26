package com.nikhil.blc;

public class Strongblc {

	public static boolean isStrong(int num)
	{
		int sum=0;
		int temp=num;
		
		
		while (num!=0)
		{
			int fact=1;
		int digit=num%10;
		for(int i=1; i<=digit; i++)
		{
			fact=fact*i;
		}
       sum=fact+sum;
		
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

