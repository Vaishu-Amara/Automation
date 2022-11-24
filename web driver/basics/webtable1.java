package project1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.dezlearn.com/webtable-example/");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		String head1="//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[1]/th[";
		String head2="]";
		String a="//*[@id=\"post-9373\"]/div/div/div/div/section/div/div/div/div/div/section/div/div/div/div/div/div/div/table/tbody/tr[";
		String b="]/td[";
		String c="]";
		for(int i=1;i<=6;i++)
		{
			String res=d.findElement(By.xpath(head1+i+head2)).getText();
			System.out.print(res+"  ");
		}
		System.out.println();
		for(int i=2;i<=7;i++)
		{
			for(int j=1;j<=6;j++)
			{
				String rslt=d.findElement(By.xpath(a+i+b+j+c)).getText();
				System.out.print(rslt+" ");
			}
			System.out.println();
		}
		File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(a1,new File("D://web.png"));
		
		
	}

	
}
