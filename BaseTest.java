package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver webDriver;
	
	public static FileReader fileReader;
	public static Properties properties=new Properties();
	
	
	@BeforeTest
	public void setUp() throws IOException {
		if(webDriver==null) {
		String path=	System.getProperty("user.dir")+"\\src\\test\\resources\\configuration\\configuration.properties";
			
		fileReader=new FileReader(path);
		properties.load(fileReader);
		}
		
		if(properties.getProperty("browser").equals("chrome")) {
			//set the ChromeDriver
			WebDriverManager.chromedriver().setup();
			//open the Browser
			webDriver=new ChromeDriver();
		}
		else if(properties.getProperty("browser").equals("edge")) {
			//set the EdgeDriver
			WebDriverManager.edgedriver().setup();
			//open the browser
			webDriver=new EdgeDriver();
		}
		else if(properties.getProperty("browser").equals("Firefox")) {
			//set up the FireFox Driver
			WebDriverManager.firefoxdriver().setup();
			//open the browser
			webDriver=new FirefoxDriver();
		}
		//Load a new web page in the current browser window
		webDriver.get(properties.getProperty("testUrl"));
		webDriver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown() {
		//close the browser
		//webDriver.close();
	}
	
}
