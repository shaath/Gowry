package functions;

public class EmpregTC
{
	public static void main(String[] args) 
	{
		orgMAster om=new orgMAster();
		
		String res=om.org_Launch(om.url);
		System.out.println(res);
		
		res=om.org_Login(om.u, om.p);
		System.out.println(res);
		
		res=om.org_EmpReg("Gowri", "Gowri");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();
	}
}
