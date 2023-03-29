package GenericUtils;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public WebDriver driver;
	FileUtility fil=new FileUtility();
	
	@BeforeSuite
	public void connectDB() {
		System.out.println("Server connected to database successfully....!");
	}
	
	@BeforeClass
	public void launchBrowser() throws IOException, InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//fil.readDataFromPropertyFile("Url");
	String 	webUrl=fil.readDataFromPropertyFile("url");
		driver.get(webUrl);
		System.out.println("Browser launched successfully...!");
		Thread.sleep(8000);
	}
	
	@AfterClass
	public void closeBrowser() {
		//driver.close();
		System.out.println("Browser closed successfully...!");
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("Server disconnected to database successfully....!");
	}
}
