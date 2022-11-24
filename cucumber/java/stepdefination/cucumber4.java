package stepdefination;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber4 {
	WebDriver d;
	@Given("user is in newtours")
	public void user_is_in_newtours() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/login.php");
	    d.manage().window().maximize();
	    
	}

	@When("user need to enter username and password")
	public void user_need_to_enter_username_and_password() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    FileInputStream f1=new FileInputStream("C:\\Users\\nilesh\\eclipse-workspace\\testing\\src\\test\\java\\stepdefination\\a4.properties");
	    Properties p1=new Properties();
	    p1.load(f1);
	    d.findElement(By.name("userName")).sendKeys(p1.getProperty("username"));
	    d.findElement(By.name("password")).sendKeys(p1.getProperty("password"));
	    
	}

	@Then("user clicks on submit button")
	public void user_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.name("submit")).click();
	}

	@And("user takes Screenshot and close the page")
	public void user_takes_screenshot_and_close_the_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	    Files.copy(f,new File("D://picture.png"));
	}
}
