// 3. Java Program to Print Pascal's Triangle

import java.io.*;

public class Qus3 
{
	public int factorial(int a)
	{
		if (a == 0)
		{
			return 1;
		}
		return a * factorial(a - 1);
	}
	
	public static void main(String[] args)
	{
		int k = 5;
		int a, b;
		Qus3 obj = new Qus3();
		
		for (a = 0; a <= k; a++) 
		{
			for (b = 0; b <= k - a; b++) 
			{
				System.out.print(" ");
			}
			for (b = 0; b <= a; b++) 
			{
				System.out.print(" "+obj.factorial(a)/(obj.factorial(a-b)*obj.factorial(b)));
			}
			System.out.println();
		}
	}
}
