package Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Quest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver",
					"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		WebElement firstname = driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		firstname.sendKeys("deva");
		 WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		 //Even days printing
		 Select s=new Select(day);
		 List<WebElement> options3= s.getOptions();
		 int count=0;

		 for (WebElement days : options3) {
			if(count %2==0)
			{
				System.out.println(days.getText());
			}count++;
		}
		 //By using getText()
		 s.selectByIndex(2);
		 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		 Select s1=new Select(month);
		 s1.selectByIndex(2);
		 List<WebElement> monthoptions = s1.getOptions();
		 for (WebElement months: monthoptions) {
			System.out.println(months.getText());
		}
		 
		 //By using getattribute
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2=new Select(year);
		List<WebElement> options = s2.getOptions();
		for(WebElement opt:options)
		{
			System.out.println(opt.getAttribute("value"));
		}
			
		
		

	}

}
