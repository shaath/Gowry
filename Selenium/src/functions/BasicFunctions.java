package functions;

public class BasicFunctions {

	public static void main(String[] args)
	{
		function1();
		String res=function2();
		System.out.println(res);
		
		BasicFunctions fun=new BasicFunctions();
		fun.function3();
		boolean flag=fun.function4();
		System.out.println(flag);
	}
	//static function without returning value
	public static void function1()
	{
		System.out.println("This is Function1 code");
	}
	
	//static function with returning values
	
	public static String function2()
	{
		System.out.println("This is Function2 code");
		return "Pass";
	}
	
	//Non static function without returning anyvalue
	public void function3()
	{
		System.out.println("This is function3 code");
	}
	//Non static function with returning values
	
	public boolean function4()
	{
		System.out.println("This is function4 code");
		return true;
	}

}
