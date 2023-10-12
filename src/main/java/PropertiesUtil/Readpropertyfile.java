package PropertiesUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Readpropertyfile {

	public String Readdata(String key) throws IOException {
		
		FileInputStream file = new FileInputStream("./login.properties");
		
		Properties pro = new Properties();
		
		pro.load(file);
		
		return pro.getProperty(key);
	}
}
