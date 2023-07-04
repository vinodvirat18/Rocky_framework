package generic_pf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_fp implements Consstants_if{
	public WebDriver driver;
@BeforeMethod
public void open() {
	System.setProperty(Gecko_key1,Gecko_value1);
	 driver = new FirefoxDriver();
	driver.get(url);
}
@AfterMethod
public void close() {
	driver.close();
}
}
