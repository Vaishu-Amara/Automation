package stepdefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
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

public class cucumber3 {
WebDriver d;
@Given("user is in dezlearn page")
public void user_is_in_dezlearn_page() {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
    d=new ChromeDriver();
    d.get("https://www.dezlearn.com/javascript-alerts/");
}

@When("user gets the url and title")
public void user_gets_the_url_and_title() {
    // Write code here that turns the phrase above into concrete actions
	 System.out.println(d.getTitle());
	 System.out.println(d.getCurrentUrl());
}

@Then("user works on alert messages")
public void user_works_on_alert_messages() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    d.findElement(By.xpath("//*[@id=\"s_alert1\"]")).click();
    Alert alt=d.switchTo().alert();
	System.out.println(alt.getText());
	Thread.sleep(2000);
	alt.accept();
}

@And("user takes screenshot and closes window")
public void user_takes_screenshot_and_closes_window() throws IOException {
    // Write code here that turns the phrase above into concrete actions
	File a1=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
	Files.copy(a1,new File("D://new2.png"));
	d.close();
}

}
