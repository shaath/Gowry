package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 40);
	
		driver.findElement(By.id("Email")).sendKeys("gandesharath");

		driver.findElement(By.name("signIn")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signIn")));
		
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		
		
		driver.findElement(By.cssSelector("#signIn")).click();

	}

}
