	package windowsHAndling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Quest2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(Options);
		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//button[@id=\"pushAllow\"]")).click();

		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("iphones 7");
		driver.findElement(By.xpath("//span[text()='Search']")).click();
		driver.findElement(By.xpath("(//p[contains(text(),\"Apple iPhone\")])[1]")).click();
		//To get parent Id
		
		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);
		//to get all id
		
		Set<String> allID = driver.getWindowHandles();
		System.out.println(allID);
		
		for(String eachID:allID)
		{
			if(!eachID.equals(ParentID))
			{
				driver.switchTo().window(eachID);
				
			}
				
		}
		driver.findElement(By.xpath("(//span[@class='intialtext'])[2]")).click();
		
		
			
		
		
	}

}
