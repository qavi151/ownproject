package Grids;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid1 {
	WebDriver driver;
  @Test
  public void setDesired() throws Exception {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setBrowserName("chrome");
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.137.250:4444"), cap);
	  driver.get("https://google.com");
	  System.out.println(driver.getTitle());
	  driver.close();
  }
}
