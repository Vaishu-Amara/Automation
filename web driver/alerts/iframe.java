package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 ChromeDriver d=new ChromeDriver();
		 d.get("https://www.dezlearn.com/iframe-example/");
		 d.manage().window().maximize();
		 d.switchTo().frame("iframe1");
		 d.findElement(By.id("u_5_6")).click();
		 Thread.sleep(2000);
		 WebElement a=d.findElement(By.id("processing"));
		 System.out.println(a.getText());
		 
		 
	}

}
