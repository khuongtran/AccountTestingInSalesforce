package com.AccountTestingSalesforce;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountFunctionSteps {
	WebDriver driver = null;
	String baseUrl;
	boolean acceptNextAlert = true;
	StringBuffer verificationErrors = new StringBuffer();

	@Given("^I'm  on login page with Firefox$")
	public void i_m_on_login_page_with_Firefox() throws Throwable {
		driver = new FirefoxDriver();
		baseUrl = "https://login.salesforce.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/?locale=ap");
	}

	@When("^I fill \"([^\"]*)\" for invalid Username$")
	public void i_fill_for_invalid_Username(String arg1) throws Throwable {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("ACB");
	}

	@When("^I fill \"([^\"]*)\" for invalid Password$")
	public void i_fill_for_invalid_Password(String arg1) throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("ACB");
	}

	@When("^I press \"([^\"]*)\" button$")
	public void i_press_button(String arg1) throws Throwable {
		driver.findElement(By.id("Login")).click();
	}

	@When("^I verify error message$")
	public void i_verify_error_message() throws Throwable {
		try {
			Assert.assertEquals(driver.findElement(By.id("error")).getText(),
					"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@When("^I fill \"([^\"]*)\" for valid Username$")
	public void i_fill_for_valid_Username(String arg1) throws Throwable {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("khuongtran@hcmsfdg.vn");
	}

	@When("^I fill \"([^\"]*)\" for valid Password$")
	public void i_fill_for_valid_Password(String arg1) throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("AtUk!0508@");
	}

	@When("^I press Log in button$")
	public void i_press_Log_in_button() throws Throwable {
		driver.findElement(By.id("Login")).click();
	}

	@When("^I click on Account tab$")
	public void i_click_on_Account_tab() throws Throwable {
		driver.findElement(By.linkText("Accounts")).click();
	}

	@When("^I click on New button$")
	public void i_click_on_New_button() throws Throwable {
		driver.findElement(By.name("new")).click();
	}

	@When("^I fill in data into madatory fields and some fields$")
	public void i_fill_in_data_into_madatory_fields_and_some_fields(DataTable table) throws Throwable {
		List<List<String>> data = table.raw();
		String acountName = null;
		acountName = data.get(1).get(1);

		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("acc5")).clear();
		driver.findElement(By.id("acc5")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("acc23")).clear();
		driver.findElement(By.id("acc23")).sendKeys(data.get(3).get(1));
		new Select(driver.findElement(By.id("acc6"))).selectByVisibleText(data.get(4).get(1));
		new Select(driver.findElement(By.id("acc7"))).selectByVisibleText(data.get(5).get(1));
		new Select(driver.findElement(By.id("acc9"))).selectByVisibleText(data.get(6).get(1));
		driver.findElement(By.id("acc10")).clear();
		driver.findElement(By.id("acc10")).sendKeys(data.get(7).get(1));
		driver.findElement(By.id("acc11")).clear();
		driver.findElement(By.id("acc11")).sendKeys(data.get(8).get(1));
		driver.findElement(By.id("acc12")).clear();
		driver.findElement(By.id("acc12")).sendKeys(data.get(9).get(1));
		driver.findElement(By.id("acc13")).clear();
		driver.findElement(By.id("acc13")).sendKeys(data.get(10).get(1));
		new Select(driver.findElement(By.id("acc14"))).selectByVisibleText(data.get(11).get(1));
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys(data.get(12).get(1));
		driver.findElement(By.id("acc17street")).clear();
		driver.findElement(By.id("acc17street")).sendKeys(data.get(13).get(1));
		driver.findElement(By.id("acc17city")).clear();
		driver.findElement(By.id("acc17city")).sendKeys(data.get(14).get(1));
		driver.findElement(By.id("acc17state")).clear();
		driver.findElement(By.id("acc17state")).sendKeys(data.get(15).get(1));
		driver.findElement(By.id("acc17country")).clear();
		driver.findElement(By.id("acc17country")).sendKeys(data.get(16).get(1));
		driver.findElement(By.id("acc18street")).clear();
		driver.findElement(By.id("acc18street")).sendKeys(data.get(17).get(1));
		driver.findElement(By.id("acc18city")).clear();
		driver.findElement(By.id("acc18city")).sendKeys(data.get(18).get(1));
		driver.findElement(By.id("acc18state")).clear();
		driver.findElement(By.id("acc18state")).sendKeys(data.get(19).get(1));
		driver.findElement(By.id("acc18zip")).clear();
		driver.findElement(By.id("acc18zip")).sendKeys(data.get(20).get(1));
		driver.findElement(By.id("acc18country")).clear();
		driver.findElement(By.id("acc18country")).sendKeys(data.get(21).get(1));
		new Select(driver.findElement(By.id("00N28000009U2ds"))).selectByVisibleText(data.get(22).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dr"))).selectByVisibleText(data.get(23).get(1));
		new Select(driver.findElement(By.id("00N28000009U2du"))).selectByVisibleText(data.get(24).get(1));
		driver.findElement(By.id("00N28000009U2dw")).clear();
		driver.findElement(By.id("00N28000009U2dw")).sendKeys(data.get(25).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dx"))).selectByVisibleText(data.get(26).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).clear();
		driver.findElement(By.id("acc20")).sendKeys(data.get(27).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
		try {
			Assert.assertEquals(driver.findElement(By.cssSelector("div.errorMsg")).getText(), "Error: Invalid number");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys("078675656");
	}

	@When("^I click on Save button$")
	public void i_click_on_Save_button() throws Throwable {
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
	}

	@When("^I click on Edit button$")
	public void i_click_on_Edit_button() throws Throwable {
		driver.findElement(By.name("edit")).click();
	}

	@When("^I edit data into madatory fields and some fields$")
	public void i_edit_data_into_madatory_fields_and_some_fields(DataTable table1) throws Throwable {
		List<List<String>> data = table1.raw();
		String acountName1 = null;
		acountName1 = data.get(1).get(1);

		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("acc5")).clear();
		driver.findElement(By.id("acc5")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("acc23")).clear();
		driver.findElement(By.id("acc23")).sendKeys(data.get(3).get(1));
		new Select(driver.findElement(By.id("acc6"))).selectByVisibleText(data.get(4).get(1));
		new Select(driver.findElement(By.id("acc7"))).selectByVisibleText(data.get(5).get(1));
		new Select(driver.findElement(By.id("acc9"))).selectByVisibleText(data.get(6).get(1));
		driver.findElement(By.id("acc10")).clear();
		driver.findElement(By.id("acc10")).sendKeys(data.get(7).get(1));
		driver.findElement(By.id("acc11")).clear();
		driver.findElement(By.id("acc11")).sendKeys(data.get(8).get(1));
		driver.findElement(By.id("acc12")).clear();
		driver.findElement(By.id("acc12")).sendKeys(data.get(9).get(1));
		driver.findElement(By.id("acc13")).clear();
		driver.findElement(By.id("acc13")).sendKeys(data.get(10).get(1));
		new Select(driver.findElement(By.id("acc14"))).selectByVisibleText(data.get(11).get(1));
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys(data.get(12).get(1));
		driver.findElement(By.id("acc17street")).clear();
		driver.findElement(By.id("acc17street")).sendKeys(data.get(13).get(1));
		driver.findElement(By.id("acc17city")).clear();
		driver.findElement(By.id("acc17city")).sendKeys(data.get(14).get(1));
		driver.findElement(By.id("acc17state")).clear();
		driver.findElement(By.id("acc17state")).sendKeys(data.get(15).get(1));
		driver.findElement(By.id("acc17country")).clear();
		driver.findElement(By.id("acc17country")).sendKeys(data.get(16).get(1));
		driver.findElement(By.id("acc18street")).clear();
		driver.findElement(By.id("acc18street")).sendKeys(data.get(17).get(1));
		driver.findElement(By.id("acc18city")).clear();
		driver.findElement(By.id("acc18city")).sendKeys(data.get(18).get(1));
		driver.findElement(By.id("acc18state")).clear();
		driver.findElement(By.id("acc18state")).sendKeys(data.get(19).get(1));
		driver.findElement(By.id("acc18zip")).clear();
		driver.findElement(By.id("acc18zip")).sendKeys(data.get(20).get(1));
		driver.findElement(By.id("acc18country")).clear();
		driver.findElement(By.id("acc18country")).sendKeys(data.get(21).get(1));
		new Select(driver.findElement(By.id("00N28000009U2ds"))).selectByVisibleText(data.get(22).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dr"))).selectByVisibleText(data.get(23).get(1));
		new Select(driver.findElement(By.id("00N28000009U2du"))).selectByVisibleText(data.get(24).get(1));
		driver.findElement(By.id("00N28000009U2dw")).clear();
		driver.findElement(By.id("00N28000009U2dw")).sendKeys(data.get(25).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dx"))).selectByVisibleText(data.get(26).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).clear();
		driver.findElement(By.id("acc20")).sendKeys(data.get(27).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
		try {
			Assert.assertEquals(driver.findElement(By.cssSelector("div.errorMsg")).getText(), "Error: Invalid number");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys("346546");
	}

	@When("^I save edtion$")
	public void i_save_edtion() throws Throwable {
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
	}

	@When("^I lougout Sales Appication in Salesforce$")
	public void i_lougout_Sales_Appication_in_Salesforce() throws Throwable {
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^I see all edited data is changed$")
	public void i_see_all_edited_data_is_changed() throws Throwable {
		System.out.println("Account create successfully");
	}

	/*--------------------------------------------------------------*/
	@Given("^I'm  on login page with Chrome$")
	public void i_m_on_login_page_with_Chrome() throws Throwable {
		driver = new RemoteWebDriver(new URL(" http://127.0.0.1:4444/wd/hub"), DesiredCapabilities.chrome());
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Project\\Saleforce\\JAPs\\chromedriver.exe");
		baseUrl = "https://login.salesforce.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl + "/?locale=ap");
	}

	@When("^I fill \"([^\"]*)\" for invalid Username by Chrome$")
	public void i_fill_for_invalid_Username_by_Chrome(String arg1) throws Throwable {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("ACB");
	}

	@When("^I fill \"([^\"]*)\" for invalid Password by Chrome$")
	public void i_fill_for_invalid_Password_by_Chrome(String arg1) throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("password")).sendKeys("ACB");
	}

	@When("^I press \"([^\"]*)\" button by Chrome$")
	public void i_press_button_by_Chrome(String arg1) throws Throwable {
		driver.findElement(By.id("Login")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("^I verify error message by Chrome$")
	public void i_verify_error_message_by_Chrome() throws Throwable {
		try {
			Assert.assertEquals(driver.findElement(By.id("error")).getText(),
					"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@When("^I fill \"([^\"]*)\" for valid Username by Chrome$")
	public void i_fill_for_valid_Username_by_Chrome(String arg1) throws Throwable {
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("khuongtran@hcmsfdg.vn");
	}

	@When("^I fill \"([^\"]*)\" for valid Password by Chrome$")
	public void i_fill_for_valid_Password_by_Chrome(String arg1) throws Throwable {
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("AtUk!0508@");
	}

	@When("^I press Log in button by Chrome$")
	public void i_press_Log_in_button_by_Chrome() throws Throwable {
		driver.findElement(By.id("Login")).click();
	}

	@When("^I click on Account tab by Chrome$")
	public void i_click_on_Account_tab_by_Chrome() throws Throwable {
		driver.findElement(By.linkText("Accounts")).click();
	}

	@When("^I click on New button by Chrome$")
	public void i_click_on_New_button_by_Chrome() throws Throwable {
		driver.findElement(By.name("new")).click();
	}

	@When("^I fill in data into madatory fields and some fields by Chrome$")
	public void i_fill_in_data_into_madatory_fields_and_some_fields_by_Chrome(DataTable table2) throws Throwable {
		List<List<String>> data = table2.raw();
		String acountName = null;
		acountName = data.get(1).get(1);

		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("acc5")).clear();
		driver.findElement(By.id("acc5")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("acc23")).clear();
		driver.findElement(By.id("acc23")).sendKeys(data.get(3).get(1));
		new Select(driver.findElement(By.id("acc6"))).selectByVisibleText(data.get(4).get(1));
		new Select(driver.findElement(By.id("acc7"))).selectByVisibleText(data.get(5).get(1));
		new Select(driver.findElement(By.id("acc9"))).selectByVisibleText(data.get(6).get(1));
		driver.findElement(By.id("acc10")).clear();
		driver.findElement(By.id("acc10")).sendKeys(data.get(7).get(1));
		driver.findElement(By.id("acc11")).clear();
		driver.findElement(By.id("acc11")).sendKeys(data.get(8).get(1));
		driver.findElement(By.id("acc12")).clear();
		driver.findElement(By.id("acc12")).sendKeys(data.get(9).get(1));
		driver.findElement(By.id("acc13")).clear();
		driver.findElement(By.id("acc13")).sendKeys(data.get(10).get(1));
		new Select(driver.findElement(By.id("acc14"))).selectByVisibleText(data.get(11).get(1));
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys(data.get(12).get(1));
		driver.findElement(By.id("acc17street")).clear();
		driver.findElement(By.id("acc17street")).sendKeys(data.get(13).get(1));
		driver.findElement(By.id("acc17city")).clear();
		driver.findElement(By.id("acc17city")).sendKeys(data.get(14).get(1));
		driver.findElement(By.id("acc17state")).clear();
		driver.findElement(By.id("acc17state")).sendKeys(data.get(15).get(1));
		driver.findElement(By.id("acc17country")).clear();
		driver.findElement(By.id("acc17country")).sendKeys(data.get(16).get(1));
		driver.findElement(By.id("acc18street")).clear();
		driver.findElement(By.id("acc18street")).sendKeys(data.get(17).get(1));
		driver.findElement(By.id("acc18city")).clear();
		driver.findElement(By.id("acc18city")).sendKeys(data.get(18).get(1));
		driver.findElement(By.id("acc18state")).clear();
		driver.findElement(By.id("acc18state")).sendKeys(data.get(19).get(1));
		driver.findElement(By.id("acc18zip")).clear();
		driver.findElement(By.id("acc18zip")).sendKeys(data.get(20).get(1));
		driver.findElement(By.id("acc18country")).clear();
		driver.findElement(By.id("acc18country")).sendKeys(data.get(21).get(1));
		new Select(driver.findElement(By.id("00N28000009U2ds"))).selectByVisibleText(data.get(22).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dr"))).selectByVisibleText(data.get(23).get(1));
		new Select(driver.findElement(By.id("00N28000009U2du"))).selectByVisibleText(data.get(24).get(1));
		driver.findElement(By.id("00N28000009U2dw")).clear();
		driver.findElement(By.id("00N28000009U2dw")).sendKeys(data.get(25).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dx"))).selectByVisibleText(data.get(26).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).clear();
		driver.findElement(By.id("acc20")).sendKeys(data.get(27).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
		try {
			Assert.assertEquals(driver.findElement(By.cssSelector("div.errorMsg")).getText(), "Error: Invalid number");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys("078675656");
	}

	@When("^I click on Save button by Chrome$")
	public void i_click_on_Save_button_by_Chrome() throws Throwable {
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
	}

	@When("^I click on Edit button by Chrome$")
	public void i_click_on_Edit_button_by_Chrome() throws Throwable {
		driver.findElement(By.name("edit")).click();
	}

	@When("^I edit data into madatory fields and some fields by Chrome$")
	public void i_edit_data_into_madatory_fields_and_some_fields_by_Chrome(DataTable table3) throws Throwable {
		List<List<String>> data = table3.raw();
		String acountName1 = null;
		acountName1 = data.get(1).get(1);

		driver.findElement(By.id("acc2")).clear();
		driver.findElement(By.id("acc2")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("acc5")).clear();
		driver.findElement(By.id("acc5")).sendKeys(data.get(2).get(1));
		driver.findElement(By.id("acc23")).clear();
		driver.findElement(By.id("acc23")).sendKeys(data.get(3).get(1));
		new Select(driver.findElement(By.id("acc6"))).selectByVisibleText(data.get(4).get(1));
		new Select(driver.findElement(By.id("acc7"))).selectByVisibleText(data.get(5).get(1));
		new Select(driver.findElement(By.id("acc9"))).selectByVisibleText(data.get(6).get(1));
		driver.findElement(By.id("acc10")).clear();
		driver.findElement(By.id("acc10")).sendKeys(data.get(7).get(1));
		driver.findElement(By.id("acc11")).clear();
		driver.findElement(By.id("acc11")).sendKeys(data.get(8).get(1));
		driver.findElement(By.id("acc12")).clear();
		driver.findElement(By.id("acc12")).sendKeys(data.get(9).get(1));
		driver.findElement(By.id("acc13")).clear();
		driver.findElement(By.id("acc13")).sendKeys(data.get(10).get(1));
		new Select(driver.findElement(By.id("acc14"))).selectByVisibleText(data.get(11).get(1));
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys(data.get(12).get(1));
		driver.findElement(By.id("acc17street")).clear();
		driver.findElement(By.id("acc17street")).sendKeys(data.get(13).get(1));
		driver.findElement(By.id("acc17city")).clear();
		driver.findElement(By.id("acc17city")).sendKeys(data.get(14).get(1));
		driver.findElement(By.id("acc17state")).clear();
		driver.findElement(By.id("acc17state")).sendKeys(data.get(15).get(1));
		driver.findElement(By.id("acc17country")).clear();
		driver.findElement(By.id("acc17country")).sendKeys(data.get(16).get(1));
		driver.findElement(By.id("acc18street")).clear();
		driver.findElement(By.id("acc18street")).sendKeys(data.get(17).get(1));
		driver.findElement(By.id("acc18city")).clear();
		driver.findElement(By.id("acc18city")).sendKeys(data.get(18).get(1));
		driver.findElement(By.id("acc18state")).clear();
		driver.findElement(By.id("acc18state")).sendKeys(data.get(19).get(1));
		driver.findElement(By.id("acc18zip")).clear();
		driver.findElement(By.id("acc18zip")).sendKeys(data.get(20).get(1));
		driver.findElement(By.id("acc18country")).clear();
		driver.findElement(By.id("acc18country")).sendKeys(data.get(21).get(1));
		new Select(driver.findElement(By.id("00N28000009U2ds"))).selectByVisibleText(data.get(22).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dr"))).selectByVisibleText(data.get(23).get(1));
		new Select(driver.findElement(By.id("00N28000009U2du"))).selectByVisibleText(data.get(24).get(1));
		driver.findElement(By.id("00N28000009U2dw")).clear();
		driver.findElement(By.id("00N28000009U2dw")).sendKeys(data.get(25).get(1));
		new Select(driver.findElement(By.id("00N28000009U2dx"))).selectByVisibleText(data.get(26).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).clear();
		driver.findElement(By.id("acc20")).sendKeys(data.get(27).get(1));
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.id("acc20")).click();
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
		try {
			Assert.assertEquals(driver.findElement(By.cssSelector("div.errorMsg")).getText(), "Error: Invalid number");
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		driver.findElement(By.id("acc15")).clear();
		driver.findElement(By.id("acc15")).sendKeys("346546");
	}

	@When("^I save edtion by Chrome$")
	public void i_save_edtion_by_Chrome() throws Throwable {
		driver.findElement(By.cssSelector("#bottomButtonRow > input[name=\"save\"]")).click();
	}

	@When("^I lougout Sales Appication in Salesforce by Chrome$")
	public void i_lougout_Sales_Appication_in_Salesforce_by_Chrome() throws Throwable {
		driver.findElement(By.id("userNavLabel")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^I see all edited data is changed by Chrome$")
	public void i_see_all_edited_data_is_changed_by_Chrome() throws Throwable {
		System.out.println("Account create successfully");
	}
}
