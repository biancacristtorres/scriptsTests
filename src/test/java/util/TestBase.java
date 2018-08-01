package util;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static String separator = System.getProperty("file.separator");
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "src" + separator + "test" + separator + "java" + separator + "resources" + separator + "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get("https://qadatake.wordpress.com/2018/07/12/the-journey-begins/");
	}
	
	public static void close() {
		driver.quit();
	}
	
}
