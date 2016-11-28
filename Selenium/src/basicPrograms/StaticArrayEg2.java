package basicPrograms;

public class StaticArrayEg2 
{
	public static void main(String[] args) 
	{
		Object[] x={20000,"Selenium",'M',40000.444,true,30000};
		
		System.out.println(x.length);
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}

	}

}
