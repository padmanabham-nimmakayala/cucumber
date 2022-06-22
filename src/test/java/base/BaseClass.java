package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.LoginPage;

public class BaseClass {

	public Properties prop;
	public static WebDriver driver;

	public void login() throws Exception {
		InputStream file = new FileInputStream(
				"C:\\Users\\prade\\eclipse-workspace\\ProHealth\\src\\test\\resources\\config.properties");
		prop = new Properties();
		prop.load(file);
		driver.navigate().to(prop.getProperty("url"));

		Assert.assertEquals(driver.getCurrentUrl(), prop.getProperty("url1"));

		driver.findElement(LoginPage.member).sendKeys(prop.getProperty("user"));
		driver.findElement(LoginPage.name).sendKeys(prop.getProperty("username"));
		driver.findElement(LoginPage.security).sendKeys(prop.getProperty("password"));
		driver.findElement(LoginPage.login).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void select(By element, int i) {
		Select dropdown1 = new Select(driver.findElement(element));
		dropdown1.selectByIndex(i);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	public void hover(By element1) {
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(element1)).perform();
	}

	public void browser(String browser) {
		/*
		 * switch (browser) { case "chrome": System.out.println("opening in chrome");
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().window().maximize(); break; case "edge":
		 * System.out.println("opening in edge"); WebDriverManager.edgedriver().setup();
		 * driver = new EdgeDriver(); driver.manage().window().maximize(); break;
		 * default:
		 * System.out.println("browser not exist so opening in default browser chrome");
		 * 
		 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
		 * driver.manage().window().maximize(); break; }
		 */
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}
}
