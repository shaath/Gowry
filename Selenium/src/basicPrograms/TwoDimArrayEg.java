package basicPrograms;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] x=new Object[2][3];
		//Rows length
		System.out.println(x.length);
		//Columns length
		System.out.println(x[0].length);
		//Writing the data into array
		x[0][1]="Sharath";
		x[1][2]="Chandra";
		//Reading the data from array
		for (int i = 0; i < x.length; i++)
		{
			for (int j = 0; j < x[i].length; j++)
			{
				System.out.println(x[i][j]);
			}
			
		}
		
	}

}
