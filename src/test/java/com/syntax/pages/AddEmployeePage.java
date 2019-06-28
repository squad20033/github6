package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class AddEmployeePage extends BaseClass {

	@FindBy(xpath = "//input[@id='firstName']")
	public WebElement firstName;

	@FindBy(xpath = "//label[contains(text(),'Middle Name')]")
	public WebElement middleName;

	@FindBy(xpath = "//label[contains(text(),'Last Name')]")
	public WebElement lastName;

	@FindBy(xpath = "//input[@id='employeeId']")
	public WebElement employeeId;
	@FindBy(xpath = "//div[@class='select-wrapper initialized']//input")
	public WebElement location;

	@FindBy(xpath = "//div[@id='location_inputfileddiv']//ul")
	public WebElement locationList;

	public AddEmployeePage() {
		PageFactory.initElements(driver, this);
	}
}
