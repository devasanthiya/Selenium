package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("321546");
		driver.findElement(By.xpath("(//img[@alt=\"continue\"])[1]")).click();
		//driver.switchTo().alert();
			
		WebElement txtpass = driver.findElement(By.xpath("(//input[@class=\"input_password\"])[2]"));
		//driver.switchTo().frame(txtpass);
		txtpass.sendKeys("23132213");

	}

}
