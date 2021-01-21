package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ques2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions a=new Actions(driver);
		//mouse over isonh MoveTo Element method
		a.moveToElement(prime).perform();
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();;
	}

}
