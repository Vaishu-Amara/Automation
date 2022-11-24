package project1;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/login.php");
		d.manage().window().maximize();
		d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
		WebElement a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
		List<WebElement> drop=a.findElements(By.tagName("a"));
		System.out.println(drop.size());
		for(int i=0;i<drop.size();i++)
		{
			System.out.println(drop.get(i).getText());
			drop.get(i).click();
			Thread.sleep(2000);
			d.navigate().back();
			System.out.println(d.getCurrentUrl());
			System.out.println(d.getTitle());
			d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a")).click();
			a=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul"));
			drop=a.findElements(By.tagName("a"));
		}
	}
}
		