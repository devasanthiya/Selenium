package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alterrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("(//table)[4]"));
		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		for(int i=0;i<tablerow.size();i++)
		{
			if(i%2==0)//Even rows
			{
				
			WebElement evenrow = tablerow.get(i);
			
		
		
		List<WebElement> cell = evenrow.findElements(By.tagName("td"));
		
		for(int j=0;j<cell.size();j++)
		{
			if(j%2==0)//even cells
			{
				WebElement evencell = cell.get(j);
				System.out.println("Alter values are:"+evencell.getText());
			}
		}
			

	}

	}
	}
}
