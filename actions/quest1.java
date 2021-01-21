package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement des2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions a=new Actions(driver);
		//Drag and drop
		a.dragAndDrop(src1, des1).perform();
		a.dragAndDrop(src2, des2).perform();
		

	}

}
