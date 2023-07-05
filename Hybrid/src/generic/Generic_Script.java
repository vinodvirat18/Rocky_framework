package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Generic_Script implements Constant_interface {
	public WebDriver driver;
@BeforeMethod
public void openapp()
{
	System.setProperty(Gecko_key,Gecko_value);
	//for browser launch
 driver= new FirefoxDriver();
	driver.get(url);
}
@AfterMethod
public void closeapp(ITestResult res) {
	if (ITestResult.FAILURE==res.getStatus()) {
		Screen_shot.sc(driver);
	}
	//to close the application
	driver.close();
	
}
}
