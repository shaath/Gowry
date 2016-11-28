package functions;

public class UserRegTc {

	public static void main(String[] args)
	{
		orgMAster om=new orgMAster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login(om.u, om.p);
		System.out.println(res);
		
		res=om.org_Userreg("Gowri Gowri", "Gowri123456", "Gowri123456", "Gowri123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
