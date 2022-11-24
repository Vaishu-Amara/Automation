package DAY1_METHODS;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class prog2 {
  WebDriver d;
	//@BeforeMethod
  @BeforeClass
  public void opening_browser() {
	  System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	  d=new ChromeDriver();
	  d.get("https://www.amazon.com");
	  d.manage().window().maximize();
  }
	@Test(priority=2)
	public void title()
	{
		System.out.println(d.getTitle());
	}
	@Test(priority=3)
	public void url()
	{
		System.out.println(d.getCurrentUrl());
	}
	@Test(priority=4)
	public void screenshot() throws IOException
	{
		File src=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://amg.png"));
	}
	@AfterClass
	//@AfterMethod
	public void closing_window()
	{
		d.close();
	}
}
