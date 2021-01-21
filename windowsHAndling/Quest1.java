package windowsHAndling;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Quest1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("iphones X ");
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[1]")).click();
		Robot r=new Robot();
		Actions a=new Actions(driver);
		WebElement Product = driver.findElement(By.xpath("(//span[contains(text(),'Apple')])[3]"));
		//mouse over
		a.moveToElement(Product).perform();
		//right click
		 a.contextClick(Product).perform();
		 
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		//Windows handling
		String ParentID = driver.getWindowHandle();
		System.out.println(ParentID);
		//to get all id
		
		Set<String> allID = driver.getWindowHandles();
		//System.out.println(allID);
		
		for(String eachID:allID)
		{
			if(!eachID.equals(ParentID))
			{
				driver.switchTo().window(eachID);
			}
				
		}
		Thread.sleep(3000);
		WebElement price = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		System.out.println(price.getText());
		
		
					
	

	}

}
