package project1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://echoecho.com/htmlforms10.htm");
		d.manage().window().maximize();
		WebElement radio=d.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		List<WebElement> b1=radio.findElements(By.tagName("input"));
		for(int i=0;i<b1.size();i++)
		{
			System.out.println(b1.get(i).getAttribute("checked")+" "+b1.get(i).getAttribute("value"));
		}
	}

}
