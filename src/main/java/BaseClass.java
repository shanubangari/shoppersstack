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
		Thread.sleep(2000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String Url = fil.readDataFromPropertyFile("url");
		Thread.sleep(3000);
		driver.get(Url);
	}
	
	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	@AfterSuite
	public void closeDB() {
		System.out.println("Server disconnected to database successfully....!");
	}
}
