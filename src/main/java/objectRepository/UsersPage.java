package objectRepository;

import org.openqa.selenium.By;

public class UsersPage {

	public static By firstnametxt = By.xpath("//*[@name='FirstName']");
	public static By lastnametxt = By.xpath("//*[@name='LastName']");
	public static By usernametxt = By.xpath("//*[@name='UserName']");
	public static By emailidtxt = By.xpath("//*[@name='EmailId']");
	public static By roleidselect = By.xpath("//*[@name='RoleId']");
	public static By orgselect = By.xpath("//*[@name='OrganizationId']");
	public static By usertypeselect = By.xpath("//*[@name='UserType']");
	public static By dobdate = By.xpath("//*[@name='DOB']");
	public static By phonetxt = By.xpath("//*[@name='PhoneNumber']");
	public static By savebtn = By.xpath("//*[@type='submit']");
	public static By deletebtn = By.xpath("//td[text()=' testauto ']/..//i");
	public static By resetbtn = By.xpath("//*[@class='btn btn-info btn-sm btn-block']");
}
