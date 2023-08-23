package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject extends BaseClass {

	public PageObject(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//input[@id='txtuId']")
	WebElement UserName;
	@FindBy(xpath = "//input[@id='txtPword']")
	WebElement PassWord;
	@FindBy(xpath = "//div[@align='right']")
	WebElement Click;

	public void username(String name) {
		UserName.sendKeys(name);
	}

	public void password(String pass) {
		PassWord.sendKeys(pass);
	}

	public void click() {
		Click.click();
	}

}
