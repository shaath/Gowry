package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMAster
{
	public static String url="http://opensource.demo.orangehrmlive.com";
	public static String u="Admin",p="admin";
	public static WebDriver driver;
	public static String expval,actval;
	public static String f="Gowri123",l="Prasanti";
	public static String ename=f+" "+l,uname=f+"123456789",pswd=f+"123456789",cpswd=f+"123456789";
	@BeforeSuite
	public void launch()
	{
		expval="LOGIN";
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Launch Failed");
	}
	@AfterSuite
	public void close()
	{
		driver.close();
	}
	
	@BeforeTest
	public void login()
	{
		expval="welcome";
		driver.findElement(By.id("txtUsername")).sendKeys(u);
		driver.findElement(By.id("txtPassword")).sendKeys(p);
		driver.findElement(By.id("btnLogin")).click();
		actval=driver.findElement(By.id("welcome")).getAttribute("id");
		Assert.assertEquals(actval, expval,"Login Failed");
	}
	@AfterTest
	public void logout()
	{
		expval="LOGIN";
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
		Assert.assertEquals(actval, expval,"Logout Failed");
	}
	
}
