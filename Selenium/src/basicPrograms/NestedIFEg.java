package basicPrograms;

import java.util.Scanner;

public class NestedIFEg {

	public static void main(String[] args) 
	{
//		int a=30000;
//		int b=400000;
//		int c=5000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value");
		int a=sc.nextInt();
		
		System.out.println("Enter B value");
		int b=sc.nextInt();
		
		System.out.println("Enter C value");
		int c=sc.nextInt();
		
		if (a > b & a > c)
		{
			System.out.println("A is greater");
		}
		else if (b > c & b > a) 
		{
			System.out.println("B is greater");
		}
		else
		{
			System.out.println("C is greater");
		}

	}

}
