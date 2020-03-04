package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class opengoogle {
	WebDriver driver;
@Test
public void opengoogle()
{
	System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://google.com/");
	
}
}
