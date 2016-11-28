package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//findElement()---
		//sending text into the textbox
		driver.findElement(By.id("Email")).sendKeys("gandesharath");
//		Sleeper.sleepTightInSeconds(5);
		//clear the text in the textbox
//		driver.findElement(By.id("Email")).clear();
		
		//clicking on the next button
		
		driver.findElement(By.name("signIn")).click();
//		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
