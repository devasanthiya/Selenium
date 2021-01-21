package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// user,pass
		WebElement user = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));

		WebElement pass = driver.findElement(By.xpath("//input[@type=\"password\"]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','88701')", user);
		js.executeScript("arguments[0].setAttribute('value','999421')", pass);

		String uservalue = user.getAttribute("value");
		System.out.println(uservalue);
//
		System.out.println(pass.getAttribute("value"));
	}

}
