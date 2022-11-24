package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        ChromeDriver d = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) d;		
        d.get("http://www.amazon.com");
        d.manage().window().maximize();
        WebElement drop=d.findElement(By.id("searchDropdownBox"));
        drop.sendKeys("luggage and bags");
        d.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop bag");
        d.findElement(By.id("nav-search-submit-button")).click();
        WebElement drop1=d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[34]/div/div/div/div/div[2]/div[1]/h2"));
        drop1.click();
        js.executeScript("arguments[0].scrollIntoView();", drop1);
	}

}
