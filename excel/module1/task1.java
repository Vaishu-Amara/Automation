package module1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task1 {
	WebDriver d;
	public void openurl()
	{
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://itera-qa.azurewebsites.net/");
		d.manage().window().maximize();
	}
	public void signup()
	{
		d.findElement(By.linkText("Sign Up")).click();
	}
	public void links() throws InterruptedException
	{
		WebElement link=d.findElement(By.id("navbarColor01"));
		List<WebElement> links=link.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());
			links.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			link=d.findElement(By.id("navbarColor01"));
			links=link.findElements(By.tagName("a"));
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		task1 obj=new task1();
		obj.openurl();
		obj.signup();
		obj.links();
	}

}
