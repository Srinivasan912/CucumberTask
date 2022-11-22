package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.BaseClass;

public class GmailPages extends BaseClass {
	public GmailPages() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="identifierId")
	private WebElement mailid;
	@FindBy(name="password")
	private WebElement password;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;
	@FindBy(xpath="(//div[contains(text(),'rkcom1002')])[2]")
	private WebElement valid;
	public WebElement getMailid() {
		return mailid;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getNext() {
		return next;
	}
	public WebElement getValid() {
		return valid;
	}

}
