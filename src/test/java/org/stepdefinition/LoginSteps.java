package org.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.pages.GmailPages;
import org.utility.BaseClass;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps extends BaseClass {
	GmailPages g = new GmailPages();

	@Given("The USer Should be in the Gmail login Page")
	public void the_USer_Should_be_in_the_Gmail_login_Page() {
	    WebDriverManager.chromedriver().setup();
	    ChromeOptions op=new ChromeOptions();
	    op.addArguments("--incognito");
	    driver = new ChromeDriver(op);
	    urlLaunch("https://www.gmail.com");
	    maximize();
	    implicitwait(10);
	}

	@When("The User has to enter the username and click the next button")
	public void the_User_has_to_enter_the_username_and_click_the_next_button() {
	   g.getMailid().sendKeys("rkcom1002");
	   g.getNext().click();
	}

	@When("The User has to enter the password and click the next button")
	public void the_User_has_to_enter_the_password_and_click_the_next_button() {
	   g.getPassword().sendKeys("1002@Rkcom");
	   g.getNext().click();
	}

	@Then("To validate the user profile for the valid login")
	public void to_validate_the_user_profile_for_the_valid_login() {
	   
	}

	@When("The User has to enter the invalid password and click the next button")
	public void the_User_has_to_enter_the_invalid_password_and_click_the_next_button() {
	    
	}

	@Then("To validate the user profile for the Invalid valid login")
	public void to_validate_the_user_profile_for_the_Invalid_valid_login() {
	    
	}


}
