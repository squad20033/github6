package com.syntax.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.syntax.pages.AddEmployeePage;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddEmployeePageTest extends BaseClass {
	@Test
	public void login() throws InterruptedException {
		LoginPage login = new LoginPage();
		HomePage home = new HomePage();
		AddEmployeePage emp = new AddEmployeePage();
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		CommonMethods.click(home.PIM);
		CommonMethods.click(home.addEmployee);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		CommonMethods.sendText(emp.firstName, "Mustafa");
		CommonMethods.sendText(emp.lastName, "Ozkan");
		CommonMethods.sendText(emp.employeeId, "007");
		CommonMethods.click(emp.location);
//1 identify list
//2 get all children with li tags
//loop through each li tag and get text
//if text is matching then we click
//break
		List<WebElement> listLocations = emp.locationList.findElements(By.tagName("li"));
		for (WebElement li : listLocations) {
			String liText = li.getText().trim();
			if (liText.equals("HQ")) {
				li.click();
				break;
			}
		}

	}

}
