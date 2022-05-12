package core;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
 /**
  * This is parent class of all classes in this framework
  * we define the properties of Webdriver, log4j, properties class
  * se every class in this framework can inherit the property of this class
  * and that is implementation of inheritance concept of OOPS.
  */
	public static WebDriver driver;
	public static Properties properties;
	public static Logger logger;
	private String configPath = ".\\src\\test\\resources\\input\\config.properties";
	private String log4jPath = ".\\src\\test\\resources\\input\\log4j.properties";
	
	
	/*
	 * we create a constructor to initialize the variables values from the 
	 * config.properties and log4j.properties files.
	 */
	public Base() {
		
		//we create object of BufferedReader class to read values from the config file
		try {
			BufferedReader reader = new BufferedReader(new FileReader(configPath));
			properties = new Properties(); // we create an object of Properties class
			properties.load(reader); // we call .load method and pass Reader as an argument 
			reader.close(); // we want to close the reader so that input stream should be closed
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		logger = logger.getLogger(log4jPath);
		PropertyConfigurator.configure(log4jPath);
		
	}
	
	public static String getUrl() {
		String url = properties.getProperty("url");
		return url; //
	}
	//this method will 
	public static String getBrowser() {
		String browser = properties.getProperty("browser");
		return browser;
	}
	//this method will close the tab or browser
	public static void launchBrowser () {
		driver.get(getUrl());
	}
	
	public static void tearDown() {
		driver.close();
//		driver.quit();
	}
		
	public void selectBrowser () {
		switch (getBrowser()) {
		case "chrome": 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "opera": 
			WebDriverManager.operadriver().setup();
			driver = new OperaDriver();
			break;
		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
}
