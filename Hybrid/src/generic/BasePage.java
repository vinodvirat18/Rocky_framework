package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
public WebDriver driver;
public BasePage(WebDriver diver) {
	PageFactory.initElements(driver, this);
}
	
}
