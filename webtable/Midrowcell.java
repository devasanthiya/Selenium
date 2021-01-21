package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Midrowcell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// fetch all row and column

		WebElement table = driver.findElement(By.xpath("(//table)[4]"));
		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		System.out.println("table row is:"+tablerow.size());
		int midrow = tablerow.size() / 2;
		//int rowsize = tablerow.size();
		
		System.out.println("mid row is:"+midrow);
		
		WebElement rows = tablerow.get(midrow);
		List<WebElement> tabledata = rows.findElements(By.tagName("td"));
		
		int midcell = tabledata.size()/2;
		System.out.println("mid cell is:"+midcell);
		
	//driver.close();
}
}