package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import functions.orgMAster;

public class LoginTC 
{
	orgMAster om=new orgMAster();
	String res=null;
	@BeforeMethod
	public void org_LAunch111()
	{
		res=om.org_Launch("http://opensource.demo.orangehrmlive.com");
		System.out.println(res);
	}
	@Test
	public void org_Login111()
	{
		res=om.org_Login("Admin", "admin");
		System.out.println(res);
	}
	@AfterMethod
	public void org_logout_close()
	{
		res=om.org_Logout();
		System.out.println(res);
		om.org_Close();
	}

}
