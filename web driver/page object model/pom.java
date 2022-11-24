package amazonpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom {
	WebDriver d;
	By Fname=By.name("firstName");
	By Lname=By.name("lastName");
	By phn=By.name("phone");
	By con=By.name("country");
	pom(WebDriver d)
	{
		this.d=d;
	}
	public void Fname()
	{
		d.findElement(Fname).sendKeys("Testing");
	}
	public void Lname()
	{
		d.findElement(Lname).sendKeys("Selenium");
	}
	public void phn()
	{
		d.findElement(phn).sendKeys("9347568268");
	}
	public void con()
	{
		d.findElement(con).sendKeys("India");
	}

}
