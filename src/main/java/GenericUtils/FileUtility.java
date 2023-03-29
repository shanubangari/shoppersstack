package GenericUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readDataFromPropertyFile(String Url) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commonData.properties");
		Properties proeprty=new Properties();
		proeprty.load(fis);
		//String Browser = proeprty.getProperty("browser");
		String Url1 = proeprty.getProperty("url");
	//	String email = proeprty.getProperty("email");
	//	String pwd = proeprty.getProperty("password");
		return Url1;
		
	}
	
	public String readEmailFromPropertyFile(String Email) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commonData.properties");
		Properties proeprty=new Properties();
		proeprty.load(fis);
		//String Browser = proeprty.getProperty("browser");
		//String Url1 = proeprty.getProperty("url");
	String Email1 = proeprty.getProperty("email");
	//	String pwd = proeprty.getProperty("password");
		return Email1;
	
		
	}
	
	public String readPwdFromPropertyFile(String userPwd) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/commonData.properties");
		Properties proeprty=new Properties();
		proeprty.load(fis);
		//String Browser = proeprty.getProperty("browser");
		//String Url1 = proeprty.getProperty("url");
	String userPwd1 = proeprty.getProperty("password");
	//	String pwd = proeprty.getProperty("password");
		return userPwd1;
	
		
	}
}
