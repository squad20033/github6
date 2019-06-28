package com.syntax.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath="//li[@class='page-title']")
	public WebElement dashboardText;
	
	@FindBy(xpath="//span[contains(text(),'PIM')]")
	public WebElement PIM;
	
	@FindBy(partialLinkText="Add Employee")
	public WebElement addEmployee;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
}
