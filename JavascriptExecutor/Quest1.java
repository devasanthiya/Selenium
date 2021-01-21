package JavascriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//path for down
		
	WebElement down = driver.findElement(By.xpath("(//div[@class=\"trainer-info\"])[5]"));
	
	//javascript executor
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//down
		js.executeScript("arguments[0].scrollIntoView(false)", down);
		//gettext
		System.out.println(down.getText());
		//up
		WebElement up = driver.findElement(By.xpath("//div[@id=\"client-logo\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", up);
			
			
	

	}

}
