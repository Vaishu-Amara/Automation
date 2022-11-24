package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		d.findElement(By.id("searchDropdownBox")).sendKeys("Deals");
		d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		d.findElement(By.id("nav-search-submit-button")).click();
		boolean selected=d.findElement(By.id("nav-search-submit-button")).isSelected();
		System.out.println(selected);
		boolean enabled=d.findElement(By.id("nav-search-submit-button")).isEnabled();
		System.out.println(enabled);
		boolean displayed=d.findElement(By.id("nav-search-submit-button")).isDisplayed();
		System.out.println(displayed);
	}

}
