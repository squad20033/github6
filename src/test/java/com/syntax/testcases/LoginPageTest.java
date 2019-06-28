package com.syntax.testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPageWithoutPageFactory;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends BaseClass {

	@Test(enabled = false)
	public void loginToOrangeHRM() {

		LoginPageWithoutPageFactory login = new LoginPageWithoutPageFactory();
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "06I@PjFbgM");
		CommonMethods.click(login.btnLogin);

	}

	@Test(enabled = false)
	public void doLogin() {
		LoginPage obj = new LoginPage();
		CommonMethods.sendText(obj.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(obj.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(obj.loginBtn);
		HomePage home = new HomePage();
		boolean isDisplayed = home.dashboardText.isDisplayed();
		Assert.assertTrue(isDisplayed);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "Manisa";
		data[0][1] = "Ankara";
		data[1][0] = "Admin2";
		data[1][1] = "Istanbul";
		data[2][0] = "Admin3";
		data[2][1] = "Izmir";
		return data;
	}

	@Test(enabled = true, dataProvider = "getData")
	public void wrongLogin(String user, String pass) {
		LoginPage login = new LoginPage();
		CommonMethods.sendText(login.userName, user);
		CommonMethods.sendText(login.password, pass);
		CommonMethods.click(login.loginBtn);
		HomePage home = new HomePage();
		boolean isDisplayed = home.dashboardText.isDisplayed();
		Assert.assertTrue(isDisplayed);
	}

}
