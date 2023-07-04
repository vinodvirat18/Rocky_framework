package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;
import generic.Generic_Script;

public class Pom_Script extends BasePage {

	@FindBy(id="email")
	private WebElement ele1;
	@FindBy(id="pass")
	private WebElement ele2;
	@FindBy(name="login")
	private WebElement ele3;

public Pom_Script( WebDriver driver) {
	super(driver);
}
public void email(String un1) {
	ele1.sendKeys(un1);
}
public void pass(String pwd1) {
	ele2.sendKeys(pwd1);
}
public void login() {
	ele3.click();
}

}
