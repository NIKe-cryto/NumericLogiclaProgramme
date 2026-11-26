package com.nikhil.elc;

import com.nikhil.blc.ArmstronBlc;

public class ArmstrongElc {

	public static void main(String[] args)
	{
		int num=Integer.parseInt(IO.readln("Enter number :"));
		boolean result=ArmstronBlc.isArmstrong(num);
		IO.println(num +" is Armstong.  "+result);
	}
	
}

