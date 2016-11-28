package basicPrograms;

public class DynamicArrayEg 
{
	public static void main(String[] args)
	{
		Object[] s=new Object[10];
		
		//Finding the length of the array
		
		System.out.println(s.length);
		
		//Writing the data into array
		
		s[2]=40000;
		s[5]="Selenium";
		s[7]='M';
		s[9]=true;
		
		s[5]="Manual";
		//Read the data from the dynamic array
		
		for (int i = 0; i < s.length; i++)
		{
			System.out.println(s[i]);
			
		}

	}

}
