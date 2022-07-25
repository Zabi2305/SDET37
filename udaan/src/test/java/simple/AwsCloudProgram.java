package simple;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AwsCloudProgram {
	
public static void main(String[] args) throws MalformedURLException {
	//Step-1: Load the URL
	URL url = new URL("http://3.18.213.187:4444/wd/hub");
	
	//Step-2: Set Desired Capabilities
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	
	//Load Remote Web Driver
	RemoteWebDriver driver = new RemoteWebDriver(url,cap);
	
	//Load the App
	driver.get("https://gmail.com");
}

}
