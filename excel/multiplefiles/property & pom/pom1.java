package multiplefiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom1 {
	FileInputStream f1;
	Properties test;
	public void method1() throws IOException
	{
		f1=new FileInputStream("C:\\Users\\nilesh\\eclipse-workspace\\excel\\src\\multiplefiles\\p2.properties");
		test=new Properties();
		test.load(f1);
	}
	
	
	WebDriver d;
	By uname=By.name("email");
	By Password=By.name("password");
	
	pom1(WebDriver d){
		this.d=d;
	}
	public void uname() {
		d.findElement(uname).sendKeys(test.getProperty("username"));
	}
	public void Password() {
		d.findElement(Password).sendKeys(test.getProperty("password"));
	}

}
