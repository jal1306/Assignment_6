// 2. Java Program to Print Square Star Pattern
//**********************
//*                    *
//*                    *
//*                    *
//*                    *
//*                    *
//*                    *
//**********************

import java.io.*;
class Qus2 
{
	public static void main(String args[])	
	{
		int k = 8, l = 22;
		int a, b;
		for (a = 1; a <= k; a++) 
		{
			for (b = 1; b <= l; b++) 
			{
				if (a == 1 || a == k || b == 1 || b == l)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}