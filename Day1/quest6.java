package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class quest6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();	
driver.get("https://www.facebook.com/ ");
WebElement txtuser=driver.findElement(By.id("email"));
WebElement txtpass=driver.findElement(By.id("pass"));
txtuser.sendKeys("8870598421");
txtpass.sendKeys("9994715321");

System.out.println(txtuser.getAttribute("value"));
System.out.println(txtpass.getAttribute("value"));
System.out.println(txtuser.getAttribute("id"));
	}

}
