package functions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class FunctionsEg {

	public static void main(String[] args)
	{
		
		int res=sum(40,60);
		System.out.println(res);
	}
	
	public static int sum(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void screenshot(WebDriver driver, String name) throws IOException
	{
		File source=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("F:\\Arzeena_Gowri\\Selenium\\src\\screenshots\\"+name+".bmp"));
	}
	
	public static void Text_Enter(WebDriver driver,String Loc,String value)
	{
		driver.findElement(By.id(Loc)).sendKeys(value);
	}
	
	public static void Button_Click(WebDriver driver,String Loc)
	{
		driver.findElement(By.id(Loc)).click();
	}

}
