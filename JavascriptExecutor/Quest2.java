package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Quest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.chrome.driver",
					"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.toolsqa.com/");
			//avoiding the notifications
			ChromeOptions Options = new ChromeOptions();
			Options.addArguments("--disable-notifications");
			//wait
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			//Java scriptexecutor
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			WebElement down = driver.findElement(By.xpath("//div[text()='Share this page']"));
			WebElement up = driver.findElement(By.xpath("//span[text()='Latest Tutorials']"));
			js.executeScript("arguments[0].scrollIntoView(false)", down);
			js.executeScript("arguments[0].crollIntoView(true)",up);
			
	}

}
