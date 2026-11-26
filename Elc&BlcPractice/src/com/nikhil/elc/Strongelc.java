package com.nikhil.elc;

import com.nikhil.blc.Strongblc;

public class Strongelc {

	public static void main(String[] args)
	{
		int num=Integer.parseInt(IO.readln("Enter number :"));
		boolean result=Strongblc.isStrong(num);
				IO.println(num +" Strong Number" +result);
	}
}
