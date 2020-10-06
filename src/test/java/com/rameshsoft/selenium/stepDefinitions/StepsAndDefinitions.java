package com.rameshsoft.selenium.stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsAndDefinitions 
{

    private RemoteWebDriver driver;
	
	
	@Before
	public void beforeTCExecution(Scenario scenario)
	{
		System.setProperty("webdriver.chrome.driver","C:\\64bitAutomationSW\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		System.out.println("===========================");
        System.out.println("Before Execution");
        
        String scName = scenario.getName();
        
        System.out.println("Scenario Name is: "+scName);
        
	}
	
    @After
	public void afterExecution(Scenario scenario)
	{
    	if (scenario.isFailed()) 
		{
		      // Take a screenshot...
		      final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		   // embed it in the report.
		      scenario.embed(screenshot, "image/png"); 
		}
    	
    	
		driver.close();
		System.out.println("After Executing test case");
		String status = scenario.getStatus();
		System.out.println("Scenario status is: "+status);
		System.out.println("===========================");
		
		
	}

	
	
	
	@Given("^when user is on landing page$")
	public void when_user_is_on_landing_page() 
	{
	   System.out.println("User is on landing page");
	}

	@When("^user enters valid un as \"([^\"]*)\" and pwd as \"([^\"]*)\"$")
	public void user_enters_valid_un_as_and_pwd_as(String un, String pwd) 
	{
		driver.findElementById("email").sendKeys(un);
	    driver.findElementById("pass").sendKeys(pwd);

	}

	@When("^when user clicks on login button$")
	public void when_user_clicks_on_login_button() 
	{
		driver.findElementById("u_0_b123").click();
	}

	@Then("^user should be on home page$")
	public void user_should_be_on_home_page() 
	{
	    System.out.println("User is on home page");	
	}


}
