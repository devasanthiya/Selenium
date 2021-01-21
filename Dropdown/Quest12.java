package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quest12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement fruits = driver.findElement(By.xpath("//select[@id=\"fruits\"]"));
		Select s=new Select(fruits);
		
		List<WebElement> options = s.getOptions();
		for (WebElement opt : options) {
			s.deselectByIndex(2);
			System.out.println(opt.getText());
		}
		//List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		
		
	}

}
