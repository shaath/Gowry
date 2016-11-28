package day3;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links= block.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) 
		{
			String Text=links.get(i).getText();
			System.out.println(Text);
			links.get(i).click();
			//getTitle()------------getcurrentUrl()
			
			System.out.println(driver.getTitle()+"--------"+driver.getCurrentUrl());
			
			//navigate()
			driver.navigate().back();
			block=driver.findElement(By.xpath(".//*[@id='Table_011']/tbody/tr[2]/td"));
			links= block.findElements(By.tagName("a"));
		}
		
	}

}