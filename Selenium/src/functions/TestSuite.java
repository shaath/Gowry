package functions;

public class TestSuite {

	public static void main(String[] args)
	{
		//Login
		orgMAster om=new orgMAster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login(om.u, om.p);
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//Empreg
		
		res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login(om.u, om.p);
		System.out.println(res);
		
		res=om.org_EmpReg("Sharath", "Chandra");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

		//Userreg
		
		res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login(om.u, om.p);
		System.out.println(res);
		
		res=om.org_Userreg("Sharath Chandra", "Sharath12345", "Sharath12345", "Sharath12345");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
		
		//UserLogin
		
		res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login("Sharath12345", "Sharath12345");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}

}
