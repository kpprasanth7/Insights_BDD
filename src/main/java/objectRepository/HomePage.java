package objectRepository;

import org.openqa.selenium.By;

public class HomePage {

	public static By profiledrpdwn = By.xpath("//*[@class='nav-link dropdown-toggle styleUserName']");
	public static By logoutbtn = By.xpath("//*[text()='Logout']");
	public static By Usersbtn = By.xpath("(//*[text()='Users'])[2]");
	public static By insightsbtn = By.xpath("(//*[text()='Insights'])");
	public static By performancebtn = By.xpath("(//*[text()=' Performance'])");
	public static By billingefficiencybtn = By.xpath("(//*[text()=' Billing Efficiency  '])");
	public static By billingefficiencytitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Billing Efficiency ']");
	public static By invoicelifecyclebtn = By.xpath("(//*[text()=' Invoice Life Cycle '])");
	public static By invoicelifecycletitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Invoice Life Cycle']");
	public static By revenuebylocationbtn = By.xpath("(//*[text()=' Revenue By Location (Zip Code) '])");
	public static By revenuebylocationtitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Revenue By Location (Zip Code)']");
	public static By technicianoverviewbtn = By.xpath("(//*[text()=' Technician Overview '])");
	public static By technicianoverviewtitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Technician Overview']");
	public static By profitandlossbtn = By.xpath("(//*[text()=' Profit and Loss '])");
	public static By profitandlosstitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Profit and Loss']");
	public static By batteryandwarrantybtn = By.xpath("(//*[text()=' Battery Warranty '])");
	public static By batteryandwarrantytitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Battery Warranty']");
	public static By organizationsbtn = By.xpath("(//*[@id='divFooter']//div//a[@href='/OrgManagement'])");
	public static By organizationstitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Organization Management']");
	public static By reportregistratinbtn = By.xpath("//*[@id='divFooter']//div//a[@href='/ReportRegistration']");
	public static By reportregistratintitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Report Registration']");
	public static By hometitle = By.xpath("//div[@id='divNavTitle']//div//H4[text()='Dashboard']");
}
