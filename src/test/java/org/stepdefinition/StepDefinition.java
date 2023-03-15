package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.base.*;

public class StepDefinition extends Base {
	@Given("User to launch chrome browser")
	public void user_to_launch_chrome_browser() {
		chrome();
		
	   
	}
	@When("To pass url")
	public void to_pass_url() {
		passurl("https://www.facebook.com/");
	    
	}
	@When("To pass Username")
	public void to_pass_username() {
		sendkeys(xpath("//input[@type='text']"),"987456123");
	    
	}
	@When("To pass the password")
	public void to_pass_the_password() {
		sendkeys(xpath("//input[@type='password']"),"212106");
	   
	}
	@Then("to press the Login button")
	public void to_press_the_login_button() {
		moveElement(xpath("//button[@type='submit']"));
		click();
	    
	}

}
