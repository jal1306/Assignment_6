// 6.  Java Program to Find Sum of Fibonacci Series Numbers of First N Even Indexes

import java.util.Scanner;

class Qus6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:- ");
		int n = sc.nextInt();
		int firstTerm = 0, secondTerm = 1;
		System.out.println("Fibonacci Series till " + n + " terms:");
		for (int i = 1; i <= n; ++i) 
		{
			System.out.print(firstTerm + ", ");
			int nextTerm = firstTerm + secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}
}