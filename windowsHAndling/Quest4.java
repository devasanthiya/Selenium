package windowsHAndling;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quest4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@id='heading303']")).click();
		driver.findElement(By.xpath("//a[text()=' DAY 10 TASK']")).click();
		//String Parentwindow = driver.getWindowHandle();
		Set<String> allwindow= driver.getWindowHandles();
		
		List<String> all=new ArrayList<>();
		
		all.addAll(allwindow);
		driver.switchTo().window(all.get(1));
		WebElement text = driver.findElement(By.xpath("//pre[@style=\"word-wrap: break-word; white-space: pre-wrap;\"]"));
		System.out.println(text.getText());
	}

}
