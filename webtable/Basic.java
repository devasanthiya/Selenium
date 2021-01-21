package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	// All the data from Webtable

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		// 1.Declare tables

		List<WebElement> tables = driver.findElements(By.tagName("table"));
		// table size in a page
		int sizeoftable = tables.size();
		System.out.println("size:"+sizeoftable);
		//Thread.sleep(3000);
		//table fetching
		WebElement table = driver.findElement(By.xpath("(//table)[4]"));
		
		List<WebElement> tablerows= table.findElements(By.tagName("tr"));
		for(int i=0;i<tablerows.size();i++)
		{
			WebElement  rows= tablerows.get(i);
			List<WebElement> tabledata = rows.findElements(By.tagName("td"));
			for(int j=0;j<tabledata.size();j++)
			{
				WebElement alldata = tabledata.get(j);
				System.out.println(alldata.getText());
			}
			
		}
		
		

	}
}
