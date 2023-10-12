package Pom.Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactPage 
{
	private WebDriver driver;
	
	public ContactPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	//web2sarchtextbox
	@FindBy(id="search_txt")
	private WebElement getsarchorg;
		
	public WebElement getsarchorg() {
		return getsarchorg;
	}
	
	//web2selectboxdd
	@FindBy(xpath = "//select[@name='search_field']")
	private WebElement selectoption;
	
	public WebElement getSelectoption() {
		return selectoption;
	}
	
	//web2sarchbutton
	@FindBy(xpath = "//input[@name='search_text']")
	private WebElement sarchorglink;
	

	public WebElement getSarchorglink() {
		return sarchorglink;
	}
	//savebutton
	@FindBy(xpath="(//input[@title='Save [Alt+S]'])[1]")
	private WebElement getsavebuttonlink;
	
	public WebElement getGetsavebuttonlink() {
		return getsavebuttonlink;
	}
	//webpage2
	@FindBy(xpath="//a[text()='wipro']")
	private WebElement getorgoption;
	
	public WebElement getGetorgoption() {
		return getorgoption;
	}

	
	//orgaddbutton
	@FindBy(xpath="//img[@alt='Select']")
	private WebElement getorganizationlink;
			
	public WebElement getorganizationlink() {
		return getorganizationlink;
	}
	

	@FindBy(xpath = "//a[normalize-space()='Home']")
	private WebElement homepagelink;
	
	@FindBy(xpath="//a[text()='Contacts']")
	private WebElement getcontactlink;
	
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement getaddcontactlink;
	
	@FindBy(xpath = "//select[@name='salutationtype']")
	private WebElement selectbox; 
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement getnametext;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement getlastnametext;

	
	public WebElement getHomepagelink() {
		return homepagelink;
	}

	public WebElement getGetcontactlink() {
		return getcontactlink;
	}
	
	public WebElement getaddcontactlink() 
	{
		return getaddcontactlink;
	}
	public WebElement selectbox() 
	{ /*
		 * WebElement list = selectbox; Select s1 = new Select(list);
		 * s1.selectByVisibleText("Mr.");
		 */	
		return selectbox;
	}
	public WebElement getnametext() 
	{
		return getnametext;
	}
	public WebElement getlastnametext() 
	{
		return getlastnametext;
	}
}
