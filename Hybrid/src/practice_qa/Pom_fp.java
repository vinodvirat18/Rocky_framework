package practice_qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom_fp {
@FindBy(xpath = "//input[@id='firstName']")
private WebElement ele1;
@FindBy(xpath = "//input[@id='lastName']")
private WebElement ele2;
@FindBy(xpath = "//input[@id='userEmail']")
private WebElement ele3;
@FindBy(xpath = "//lable[@class='custom-control-label']")
private WebElement ele4;
@FindBy(xpath = "//input[@id='userNumber']")
private WebElement ele5;
@FindBy(xpath = "//input[@id='dateOfBirthInput']")
private WebElement ele6;
@FindBy(xpath = "//lable[@class='custom-control-label']")
private WebElement ele7;
@FindBy(xpath = "//input[@id='uploadPicture']")
private WebElement ele8;
@FindBy(xpath = "//textarea[@name='form-control']")
private WebElement ele9;
@FindBy(xpath = "//div[.='Select State']")
private WebElement ele10;
@FindBy(xpath = "//div[@class='col-md-4 col-sm-12']")
private WebElement ele11;

}
