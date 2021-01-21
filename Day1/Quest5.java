package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.swiggy.com/");
	WebElement txtuser = driver.findElement(By.xpath("//input[@type='text']"));
	txtuser.sendKeys("Chennai");
	//driver.findElement(By.xpath("//span[text()='FIND FOOD']"));
	driver.findElement(By.xpath("//span[contains(text(),'International ')]")).click();
	

	}

}
