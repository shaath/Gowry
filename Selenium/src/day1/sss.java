package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class sss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='app']/div/div[2]/div[2]/div[3]/div[3]/div")).click();
		Sleeper.sleepTight(5000);
		
		driver.findElement(By.id("input_0")).click();
		Sleeper.sleepTight(5000);
		driver.findElement(By.id("input_0")).sendKeys("sharath");
	}

}
