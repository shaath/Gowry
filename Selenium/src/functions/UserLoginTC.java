package functions;

public class UserLoginTC {

	public static void main(String[] args)
	{
		
		orgMAster om=new orgMAster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login("Gowri123456", "Gowri123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}

}
