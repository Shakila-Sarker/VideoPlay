package loadvideo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestVideo {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");

	
		WebDriver driver = new FirefoxDriver();
		driver.get("file:/F:/QA/Unit%20testing/Basics/test.html");
		
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@src='https://www.youtube.com/embed/Fkd9TWUtFm0']"));
		        driver.switchTo().frame(frameElement);
		        driver.findElement(By.xpath("//button[@aria-label=\'Play\']")).click();

	}

}
