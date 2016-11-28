package basicPrograms;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) 
	{
//		Scanner sc=new Scanner(System.in);
		
		String course="Manual";
		
		switch (course)
		{
		case "selenium":
			System.out.println("You are selceted selenium");
			break;
		case "Uft":
			System.out.println("You are selcted Uft");
			break;
		case "Manual":
			System.out.println("You are selected manual");
			break;
		case "Loadrunner":
			System.out.println("You are selected Loadrunner");
			break;
		default:
			System.out.println("Select a proper course");
			break;
		}
		
		

	}

}
