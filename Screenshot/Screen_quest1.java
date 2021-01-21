package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_quest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://www.greenstechnologys.com/");
driver.manage().window().maximize();//Typecasting
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);

File des=new File("E:\\Software\\eclipse-java-photon-R-win32-x86_64\\eclipse\\deva\\selenium Proj\\Screens\\1.jpeg");
FileUtils.copyFile(src, des);
}

}
