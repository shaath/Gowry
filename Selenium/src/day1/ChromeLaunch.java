package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class ChromeLaunch {

	public static void main(String[] args) 
	{
//		System.setProperty("webdriver.chrome.driver", "F:/Cdownloads/chromedriver.exe");
//		ChromeDriver driver=new ChromeDriver();
		System.setProperty("webdriver.opera.driver", "F:/Cdownloads/operadriver.exe");
		OperaDriver driver=new OperaDriver();
		
		driver.get("http://google.com");
		
		driver.close();
	}

}
