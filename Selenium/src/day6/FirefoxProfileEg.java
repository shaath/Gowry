package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class FirefoxProfileEg {

	public static void main(String[] args)
	{
		
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("Gowri");
		
		
		WebDriver driver=new FirefoxDriver(fp);
		

	}

}
