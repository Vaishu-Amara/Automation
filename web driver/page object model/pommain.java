package amazonpage;

import org.openqa.selenium.chrome.ChromeDriver;

public class pommain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/register.php");
		d.manage().window().maximize();
		pom obj=new pom(d);
		obj.Fname();
		obj.Lname();
		obj.phn();
		obj.con();
		

	}

}
