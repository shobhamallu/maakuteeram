package reusablemethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class homepage {
	WebDriver driver;
	FileInputStream fis;
	Properties ps;
	@Test
public void clickonsignin() throws IOException
{
		fis=new FileInputStream("C:\\Users\\admin\\workspace\\maakuteeram\\src\\config\\home.properties");
		ps=new Properties();
		ps.load(fis);
		System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://maakuteeram.com/");
		driver.findElement(By.xpath(ps.getProperty("signin"))).click();
		
		
}
	
	@Test()
	public void userlogin(String email,String password) throws IOException
	{
		fis=new FileInputStream("C:\\Users\\admin\\workspace\\maakuteeram\\src\\config\\loginpage.properties");
		ps=new Properties();
		ps.load(fis);
	driver.findElement(By.xpath(ps.getProperty("email"))).sendKeys(email);
	driver.findElement(By.xpath(ps.getProperty("password"))).sendKeys(password);
	driver.findElement(By.xpath(ps.getProperty("login"))).click();
	}	
	
}
