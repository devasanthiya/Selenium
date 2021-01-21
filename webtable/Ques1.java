package webtable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ques1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();

		// wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement table = driver.findElement(By.xpath("//table"));
		List<WebElement> tablerow = table.findElements(By.tagName("tr"));
		WebElement alldata = null;
		String text = null;
		System.out.println("rows size: "+tablerow.size());
		for (int i = 0; i < tablerow.size(); i++) {
			WebElement allrow = tablerow.get(i);
			WebElement firstrow = tablerow.get(0);
			

			List<WebElement> tabledata = allrow.findElements(By.xpath("//td"));
			for (int j = 0; j < tabledata.size(); j++) {
				alldata = tabledata.get(j);
				text = alldata.getText();
				System.out.println("All values:" + text);

			}
			
			System.out.println("First row:" + firstrow.getText());
		}

	}

}
