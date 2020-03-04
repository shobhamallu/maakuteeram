package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import reusablemethods.homepage;
import reusablemethods.login;

public class verifylogin {
	WebDriver driver;
@Test
public void verifyuserlogin() throws IOException, InterruptedException
{
reusablemethods.homepage home=new homepage();
home.clickonsignin();
 
home.userlogin("mshoba219@gmail.com", "chinnu");


}
}

