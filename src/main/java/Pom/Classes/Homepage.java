package Pom.Classes;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	private WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver ;
		PageFactory.initElements(driver,this);
	}

	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement homepagelink; 
	//orgpagelink
	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement orgPageLink;
	//plussignorg
	@FindBy(xpath="//img[@title='Create Organization...']")
	private WebElement AddOrglink;
	//industryDD
	@FindBy(xpath="//select[@name='industry']")
	private WebElement SelectIndustrydd;
	//orgnametextbox
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement OrgNameText;
	
	
	public WebElement AddOrglink() {
		return AddOrglink;
	}
	public WebElement OrgNameText() {
		return OrgNameText;
	}
	public WebElement SelectIndustrydd() {
		return SelectIndustrydd;
	}
	public WebElement getHomepagelink() {
		return homepagelink;
	}

	public WebElement getOrgPagelink() {
		return orgPageLink;
	}

	public WebDriver getDriver() {
		return driver;
	}

	
	
	

	

}
