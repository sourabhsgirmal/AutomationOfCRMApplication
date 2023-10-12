package Selenium_demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LunchBrowser {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://gmail.com");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("pooja.a.patil99@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
	}

}
