package stepdefinition;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DashBoard;
import pages.PassingPage;
import pages.SecurityDomain;

public class StepDefinition extends BaseClass {

	@Given("i need to navigate to webpage")
	public void initialisebrowser() throws IOException {
		StepDefinition frame = new StepDefinition();
		frame.browser("chrome");
	}

	@And("login to prohealth home page")
	public void homepagelogin() throws Exception {
		login();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		select(PassingPage.hospital, 1);
		select(PassingPage.role, 1);
		driver.findElement(PassingPage.click).click();
	}

	@Then("prohealth frontoffice dashboard should be displayed")
	public void homepage() {
		Assert.assertEquals(prop.getProperty("url2"), driver.getCurrentUrl());
	}

	@And("mousehover on settings and security and click on users")
	public void securitypage() {
		hover(DashBoard.settings);
		hover(SecurityDomain.security);
		driver.findElement(SecurityDomain.user).click();
	}

	@Then("users page should be displayed")
	public void user() {
		Assert.assertEquals(prop.getProperty("url4"), driver.getCurrentUrl());
	}

	@Then("all the table headings should be displayed")
	public void validatingtable() {
		WebElement table = driver.findElement(SecurityDomain.usertable);
		List<WebElement> rows = table.findElements(SecurityDomain.tablerows);
		int rowcount = rows.size();
		List<WebElement> columns = table.findElements(SecurityDomain.tablecolumns);
		int columncount = columns.size();
		for (int i = 1; i <= columncount; i++) {
			boolean value = table.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[2]/table/thead/tr/th[" + i + "]"))
					.isDisplayed();
			Assert.assertTrue(value);
		}
	}

	@And("verify the add button at the top")
	public void addbutton() {
		boolean value2 = driver.findElement(SecurityDomain.useradd).isDisplayed();
		Assert.assertTrue(value2);
	}

	@Then("close the browser")
	public void teardown() {
		driver.close();
	}
}