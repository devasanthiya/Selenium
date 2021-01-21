package Robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class quest11 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.co.in/webhp");
WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
Actions a=new Actions(driver);
//Keydown-Actions
a.keyDown(search, Keys.SHIFT).sendKeys("velmurugan");

a.doubleClick(search).perform();
a.contextClick(search).perform();
Robot r=new Robot();
//for(int i=1;i<5;i++)
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
a.contextClick(search).perform();

for(int i=1;i<3;i++) {
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
r.keyPress(KeyEvent.VK_ENTER);;
r.keyRelease(KeyEvent.VK_ENTER);


	}

}
	