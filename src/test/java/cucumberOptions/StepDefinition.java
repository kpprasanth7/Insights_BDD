package stepDefinitions;

import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import objectRepository.HomePage;
import objectRepository.LoginPage;
import objectRepository.UsersPage;

@RunWith(Cucumber.class)
public class StepDefinition {
	WebDriver driver;
	Actions actions;
	WebDriverWait w;

	protected String getSaltString() {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder salt = new StringBuilder();
		Random rnd = new Random();
		while (salt.length() < 10) { // length of the random string.
			int index = (int) (rnd.nextFloat() * SALTCHARS.length());
			salt.append(SALTCHARS.charAt(index));
		}
		String saltStr = salt.toString();
		return saltStr;
	}
	

	@Before("@edge")
	public void open_new() {
		System.setProperty("webdriver.edge.driver", ".\\driver\\msedgedriver.exe");
		driver = new EdgeDriver();
		actions = new Actions(driver);
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	@Before("@chrome")
	public void open_newbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}
	
	@Before("@test")
	public void open_testbrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		actions = new Actions(driver);
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		
	}

	@Given("^user is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		driver.navigate().to("https://uatapp.signainsights.com/");
		driver.manage().window().maximize();
	}

	@When("^user entered \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_entered_username_and_password(String username, String password) throws Throwable {
		driver.findElement(LoginPage.username).sendKeys(username);
		driver.findElement(LoginPage.password).sendKeys(password);
	}

	@Then("^the user should be navigated to homepage$")
	public void the_user_should_be_navigated_to_homepage() throws Throwable {
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.hometitle));
	}

	@Then("^the user should be navigated to Users page$")
	public void the_user_should_be_navigated_to_users_page() throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.Usersbtn)).click();
	}

	@Then("^the user is able to delete the newly created userid$")
	public void the_user_is_able_to_delete_the_newly_created_userid() throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(UsersPage.deletebtn)).click();
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
	}

	@And("^clicked on the login button$")
	public void clicked_on_the_login_button() throws Throwable {
		driver.findElement(LoginPage.submitbtn).click();
	
	}
	@And("^the user should be navigated to Organizations page$")
    public void the_user_should_be_navigated_to_organizations_page() throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.organizationsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.organizationstitle)).isDisplayed();
    }
	
	@And("^the user should be navigated to Report Registration page$")
    public void the_user_should_be_navigated_to_report_registration_page() throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.reportregistratinbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.reportregistratintitle)).isDisplayed();
    }
	@And("^the user should be logged out from the signainsights$")
	public void the_user_should_be_logged_out_from_the_signainsights() throws Throwable {
		Thread.sleep(5000);
		w.until(ExpectedConditions.elementToBeClickable(HomePage.profiledrpdwn)).click();
		w.until(ExpectedConditions.elementToBeClickable(HomePage.logoutbtn)).click();
	}

	@And("^the user clicks Insights and Navigate to Billing Efficiency page and verify if it lands in Billing Efficiency page$")
	public void the_user_clicks_insights_and_navigate_to_billing_efficiency_page_and_verify_if_it_lands_in_billing_efficiency_page()
			throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.insightsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.performancebtn));
		actions.moveToElement(driver.findElement(HomePage.performancebtn));
		actions.perform();
		driver.findElement(HomePage.billingefficiencybtn).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.billingefficiencytitle)).isDisplayed();
	}

	@And("^the user clicks Insights and Navigate to Invoice Life Cycle page and verify if it lands in Invoice Life Cycle page$")
	public void the_user_clicks_insights_and_navigate_to_Invoice_Life_Cycle_page_and_verify_if_it_lands_in_Invoice_Life_Cycle_page()
			throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.insightsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.performancebtn));
		actions.moveToElement(driver.findElement(HomePage.performancebtn));
		actions.perform();
		driver.findElement(HomePage.invoicelifecyclebtn).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.invoicelifecycletitle)).isDisplayed();
	}

	@And("^the user clicks Insights and Navigate to Revenue By Location page and verify if it lands in Revenue By Location page$")
	public void the_user_clicks_insights_and_navigate_to_revenue_by_location_page_and_verify_if_it_lands_in_revenue_by_location_page()
			throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.insightsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.performancebtn));
		actions.moveToElement(driver.findElement(HomePage.performancebtn));
		actions.perform();
		driver.findElement(HomePage.revenuebylocationbtn).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.revenuebylocationtitle)).isDisplayed();
	}

	@And("^the user clicks Insights and Navigate to Technician Overview page and verify if it lands in Technician Overview page$")
	public void the_user_clicks_insights_and_navigate_to_technician_overview_page_and_verify_if_it_lands_in_technician_overview_page()
			throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.insightsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.performancebtn));
		actions.moveToElement(driver.findElement(HomePage.performancebtn));
		actions.perform();
		driver.findElement(HomePage.technicianoverviewbtn).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.technicianoverviewtitle)).isDisplayed();
	}

	@And("^the user clicks Insights and Navigate to Profit and Loss page and verify if it lands in Profit and Loss page$")
	public void the_user_clicks_insights_and_navigate_to_profit_and_loss_page_and_verify_if_it_lands_in_profit_and_loss_page()
			throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.insightsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.performancebtn));
		actions.moveToElement(driver.findElement(HomePage.performancebtn));
		actions.perform();
		driver.findElement(HomePage.profitandlossbtn).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.profitandlosstitle)).isDisplayed();
	}

	@And("^the user clicks Insights and Navigate to Battery and Warranty page and verify if it lands in Battery and Warranty page$")
	public void the_user_clicks_insights_and_navigate_to_battery_and_warranty_page_and_verify_if_it_lands_in_battery_and_warranty_page()
			throws Throwable {
		Thread.sleep(2000);
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.insightsbtn)).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.performancebtn));
		actions.moveToElement(driver.findElement(HomePage.performancebtn));
		actions.perform();
		driver.findElement(HomePage.batteryandwarrantybtn).click();
		w.until(ExpectedConditions.presenceOfElementLocated(HomePage.batteryandwarrantytitle)).isDisplayed();
	}

	@And("^the user is able to enter all the details to create new user$")
	public void the_user_is_able_to_enter_all_the_details_to_create_new_user() throws Throwable {
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(UsersPage.resetbtn)));
		//Thread.sleep(5000);
		driver.findElement(UsersPage.firstnametxt).sendKeys("testauto");
		driver.findElement(UsersPage.lastnametxt).sendKeys("test");
		String username = getSaltString();
		driver.findElement(UsersPage.usernametxt).sendKeys(username);
		String email = getSaltString() + "@gmail.com";
		driver.findElement(UsersPage.emailidtxt).sendKeys(email);
		Select userroleselect = new Select(driver.findElement(UsersPage.roleidselect));
		userroleselect.selectByValue("1");
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(UsersPage.orgselect)));
		Select orgselect = new Select(driver.findElement(UsersPage.orgselect));
		orgselect.selectByValue("2005");
		Select usertypeselect = new Select(driver.findElement(UsersPage.usertypeselect));
		usertypeselect.selectByValue("2");
		w.until(ExpectedConditions.elementToBeClickable(driver.findElement(UsersPage.dobdate))).clear();
		driver.findElement(UsersPage.dobdate).sendKeys("12/08/2000");
		driver.findElement(UsersPage.phonetxt).sendKeys("1235512344");
		driver.findElement(UsersPage.savebtn).click();
	}
	
	

	@After
	public void close_browser() throws Throwable {
		System.out.println("Execution is done");
		driver.quit();
	}
}
