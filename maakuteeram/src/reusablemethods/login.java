package reusablemethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class login {
WebDriver driver;
FileInputStream fis;
Properties ps;
homepage page;
@Test()
public void userlogin(String email,String password) throws IOException
{
	page=new homepage();
	driver=page.driver;
	fis=new FileInputStream("C:\\Users\\admin\\workspace\\maakuteeram\\src\\config\\loginpage.properties");
	ps=new Properties();
	ps.load(fis);
driver.findElement(By.xpath(ps.getProperty("email"))).sendKeys(email);
driver.findElement(By.xpath(ps.getProperty("password"))).sendKeys(password);
driver.findElement(By.xpath(ps.getProperty("login"))).click();
}
}
