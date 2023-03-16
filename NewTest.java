package Grids;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  DesiredCapabilities cap = new DesiredCapabilities();
	  cap.setBrowserName("chrome");
	  WebDriver driver = new RemoteWebDriver(new URL("http://192.168.137.250:4444"), cap);
	  driver.get("https://demo.guru99.com/test/newtours/");
	  System.out.println(driver.getTitle());
	  driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  driver.close();
  }
}
