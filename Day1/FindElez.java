package Day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElez {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
Thread.sleep(3000);
List<WebElement> findElements = driver.findElements(By.xpath("//input[@name='sex']"));
System.out.println(findElements.size());
	}

}
