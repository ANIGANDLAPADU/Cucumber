package StepDefinition;

import java.util.ResourceBundle;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.PageObject;

public class stepdefinition {
	public WebDriver driver;
	Logger logger;
	ResourceBundle rb;
	String appurl;
	String username;
	String password;

	@Before
	public void setup() {
		logger = LogManager.getLogger(this.getClass());
		rb = ResourceBundle.getBundle("dynamic");
		appurl = rb.getString("url");
		username=rb.getString("email");
		password=rb.getString("password");

	}

	@After
	public void teardown() {
		driver.close();
	}

	@Given("open the browser")
	public void open_the_browser() {
		driver = new ChromeDriver();
	}

	@Given("open the URL {string}")
	public void open_the_url(String appurl) {
		driver.get(appurl);
	}

	@When("Enter user name as {string} Password as {string}")
	public void enter_user_name_as_password_as(String username, String password) {
		PageObject pageobject = new PageObject(driver);
		pageobject.username(username);
		pageobject.password(password);
		
	}

	@Then("Click on LoginButton")
	public void click_on_login_button() {
		PageObject pageobject = new PageObject(driver);
		pageobject.click();
	}

}
