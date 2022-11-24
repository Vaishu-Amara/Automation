package project1;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog1 {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webddriver.chrome.driver","c:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.com");
		d.manage().window().maximize();
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		Thread.sleep(2000);
		d.close();
	}

}
