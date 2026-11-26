package com.nikhil.elc;

import com.nikhil.blc.Palindronblc;
import com.nikhil.blc.Strongblc;

public class Palindromelc {
public static void main(String[] args)
{
	int num=Integer.parseInt(IO.readln("Enter Number : "));
	boolean result=Palindronblc.isPalindrom(num);
	IO.println(num+" is Palindrome Number " + result);
}
}
