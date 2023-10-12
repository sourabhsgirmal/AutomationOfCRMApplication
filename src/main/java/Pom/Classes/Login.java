package Pom.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	
	private WebDriver driver;
	
	public Login(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="user_name")
	private WebElement usernametextfield;
	
	@FindBy(name="user_password")
	private WebElement uaserpasswordtextfield;
	
	@FindBy(id="submitButton")
	private WebElement submitButton;

	public WebElement getUsernametextfield()
	{
		return usernametextfield;
	}
	public WebElement getUaserpasswordtextfield()
	{
		return uaserpasswordtextfield;
	}
	public WebElement getSubmitButton() 
	{
		return submitButton;
	}

	


}
