package Com.Baseclass;

import java.io.IOException;import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Pom.Classes.Login;
import PropertiesUtil.Readpropertyfile;
	
public class Base {
	public WebDriver driver = null;
	Readpropertyfile readpropertyfile = new Readpropertyfile();
	
	
	@BeforeClass
	public WebDriver LunchBrowser() throws IOException 
	{
		
		String browser = readpropertyfile.Readdata("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else {
			System.out.println("enter valid browser");
		}
		
		driver.get(readpropertyfile.Readdata("link"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
	}
	@BeforeMethod
	public void Loginpage() throws IOException 
	{
		Login login = new Login(driver);
		login.getUsernametextfield().sendKeys(readpropertyfile.Readdata("username"));
		login.getUaserpasswordtextfield().sendKeys(readpropertyfile.Readdata("password"));
		login.getSubmitButton().click();
	}
	
	public void selectdd(WebElement element,String vaule)
	{
	Select select = new Select(element) ;
	select.selectByVisibleText(vaule);
	}
	public WebDriver Switchtowindow(WebDriver driver,String value ) 
	{
		String parentwindow=driver.getWindowHandle();
	Set<String> allwindows=driver.getWindowHandles();
	Iterator<String>window = allwindows.iterator();
	while(window.hasNext()) {
		String singlewin = window.next();
		driver.switchTo().window(singlewin);
		if(driver.getCurrentUrl().contains(value)) {
			break;
		}
	}
	return driver;
	
	}
	
	
	
	
	@AfterClass
	public void closebrowser() throws InterruptedException 
	{
		Thread.sleep(6000);
		driver.close();
	}
}
