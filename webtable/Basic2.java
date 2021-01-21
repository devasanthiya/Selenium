package webtable;

import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic2 {
//Pick the row and column from data
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();

		// fetch all row and column

		WebElement table = driver.findElement(By.xpath("(//table)[4]"));
		// System.out.println(table.getText());

		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		for (int i = 0; i < tablerow.size(); i++) {

			WebElement rows = tablerow.get(i);
			List<WebElement> tabledata = rows.findElements(By.tagName("td"));
			for (int j = 0; j < tabledata.size(); j++) {
				WebElement alldata = tabledata.get(j);
				String data = alldata.getText();
				if (data.equals("Germany")) {
					System.out.println(data);
					System.out.println("row is:" + i);
					System.out.println("cell is:" + j);
				}
			}
		}

	}

}
