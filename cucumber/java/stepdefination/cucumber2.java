package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber2 {
	WebDriver d;
	@Given("open newtours")
	public void open_newtours() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://demo.guru99.com/test/newtours/index.php");
		d.manage().window().maximize();
	}

	@When("click on register window")
	public void click_on_register_window() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@Then("select india fromm dropdown")
	public void select_india_fromm_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.name("country")).sendKeys("india");
	}

	@And("close the window")
	public void close_the_window() {
	    // Write code here that turns the phrase above into concrete actions
	    d.close();
	}


}
