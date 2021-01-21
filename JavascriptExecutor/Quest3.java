package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement user = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		WebElement btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//send the value through javascriptexecutor
		js.executeScript("arguments[0].setAttribute('value','88701')", user);
		js.executeScript("arguments[0].setAttribute('value','999421')", pass);
		
		//click login
		
		js.executeScript("arguments[0].click()", btn);

	}

}
