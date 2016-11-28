package day7;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MultipleWindowhandling {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getWindowHandle());
		driver.findElement(By.linkText("Privacy")).click();
		
		
		Set<String> s=driver.getWindowHandles();
		
		Iterator<String> it=s.iterator();
		
		while (it.hasNext()) 
		{
			String wid=it.next();
			System.out.println(wid);
			
			driver.switchTo().window(wid);
			System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
			
			try
			{
				driver.findElement(By.linkText("Terms of Service")).click();
				Sleeper.sleepTightInSeconds(3);
				System.out.println(driver.getTitle()+"----"+driver.getCurrentUrl());
				
			} 
			catch (Exception e) 
			{
				System.out.println("The expected link not available in this page");
			}
			
		}
		

	}

}
