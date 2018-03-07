package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Indianic.CucumberDD.Browserselection;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest extends Browserselection{
	
	WebDriver driver;
@Given("^User Enter url$")
	public void user_Enter_url() throws Throwable {
		
	driver= LoginTest.startbrowser("http://the-internet.herokuapp.com/login", "Chrome");
	    }

@When("^User Enter Username and Password$")
	public void user_Enter_Username_and_Password() throws Throwable {
		// enter into the text field without using sendkeys
		((JavascriptExecutor)driver).executeScript("document.getElementById('username').value='tomsmith';");
				
		//driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
		driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
	    }

@When("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		WebElement login=driver.findElement(By.xpath(".//button[@class='radius']"));
		login.click();
	}

@Then("^User should be logged in Successfully$")
	public void user_should_be_logged_in_Successfully() throws Throwable {
	 System.out.println("Hello i m here and logged In successfully");
	 
	 Thread.sleep(2000);
	 driver.quit();
	}

}
