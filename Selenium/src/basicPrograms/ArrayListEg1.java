package basicPrograms;

import java.util.ArrayList;

public class ArrayListEg1 {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		x.add("Selenium");
		x.add("Manual");
		x.add(30000);
		x.add(true);
		
		System.out.println(x.size());
		
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
			
		}
		

	}

}
