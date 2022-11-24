package stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumber5 {
	WebDriver d;
	@Given("user opens newtours website")
	public void user_opens_newtours_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://demo.guru99.com/test/newtours/login.php");
	    d.manage().window().maximize();
	}

	@When("user clicks on register")
	public void user_clicks_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
	}

	@Then("user need to get country names from dropdown")
	public void user_need_to_get_country_names_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement drop=d.findElement(By.name("country"));
	    List<WebElement> drop1=d.findElements(By.tagName("option"));
	    for(int i=0;i<drop1.size();i++)
	    {
	    	System.out.println(drop1.get(i).getText());
	    }
	}

	@And("user navigate back to home page")
	public void user_navigate_back_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    d.navigate().back();
	}

	@And("user close the window")
	public void user_close_the_window() {
	    // Write code here that turns the phrase above into concrete actions
		d.close();
	}
}
