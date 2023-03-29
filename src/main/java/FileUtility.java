import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {

	public String readDataFromPropertyFile(String url) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData.commonData.properties");
		Properties proeprty=new Properties();
		proeprty.load(fis);
//		String Browser = proeprty.getProperty("browser");
		String Url = proeprty.getProperty("url");
//		String email = proeprty.getProperty("email");
//		String pwd = proeprty.getProperty("password");
		return Url;
		
	}
}
