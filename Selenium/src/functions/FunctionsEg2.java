package functions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionsEg2
 {

	public static void main(String[] args) throws IOException 
	{
		FunctionsEg fun=new FunctionsEg();
		
//		int res=fun.sum(50, 50);
//		System.out.println(res);
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		fun.Text_Enter(driver, "txtUsername", "Admin");
		fun.Text_Enter(driver, "txtPassword", "admin");
		fun.Button_Click(driver, "btnLogin");
	}

}
