package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class methods {
	WebDriver d;
	public void opening_browser()
	{
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/");
	}
	public void Navigate()
	{
		d.manage().window().maximize();
	}
	public void usernameenter()
	{
		d.findElement(By.name("userName")).sendKeys("Vaishnavi");
	}
	public void passwordenter()
	{
		d.findElement(By.name("password")).sendKeys("12345");
	}
	public void click()
	{
		d.findElement(By.name("submit")).click();
	}
	public void closing()
	{
		d.close();
	}

}
