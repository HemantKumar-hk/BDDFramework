package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination 
{
	WebDriver driver;
	
	@Given("Application is up and running")
	public void application_is_up_and_running() 
	{
	    driver.get("https://freelance-learn-automation.vercel.app/login");
	    
	}

	@When("User enter username as {string}")
	public void user_enter_username_as(String user) 
	{
	    driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(user);
	    
	}

	@And("User enter password as {string}")
	public void user_enter_password_as(String pass) 
	{
	    
	    driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(pass);
	}

	@And("click on login button")
	public void click_on_login_button() 
	{
	    driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
	    
	}

	@Then("User should be able to login and see welcome message")
	public void user_should_be_able_to_login_and_see_welcome_message() 
	{
	    Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='welcomeMessage']")).getText().contains("Welcome"));
	    
	}
}
