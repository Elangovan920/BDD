package org.stepdef;

import java.util.List;
import java.util.Map;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;


public class StepDefnitions extends BaseClass {
	@Given("the user should be in facebook home page")
	public void the_user_should_be_in_facebook_home_page() {
		
	}

	@When("the user fills the valid login creditionals in username and password field")
	public void the_user_fills_the_valid_login_creditionals_in_username_and_password_field(io.cucumber.datatable.DataTable list) {
	   List<Map<String, String>> lm = list.asMaps();
	   driver.findElement(By.id("email")).sendKeys(lm.get(0).get("user"));
	   WebElement ele = driver.findElement(By.id("pass"));
	   ele.sendKeys(lm.get(0).get("pass"));
	   String pass = ele.getAttribute("value");
	   System.out.println(pass);
	}




	@When("click the login button")
	public void click_the_login_button() {
		 driver.findElement(By.name("login")).click();;
	}

	@Then("the user should navigate to the home page")
	public void the_user_should_navigate_to_the_home_page() {
	  System.out.println("user is in valid page");
	}
	@When("the user fills the invalid login creditionals in username and password field")
	public void the_user_fills_the_invalid_login_creditionals_in_username_and_password_field(io.cucumber.datatable.DataTable map) {
		 List<Map<String, String>> lm = map.asMaps();
		   driver.findElement(By.id("email")).sendKeys(lm.get(1).get("user"));
		   WebElement ele = driver.findElement(By.id("pass"));
		   ele.sendKeys(lm.get(1).get("pass"));
		   String pass = ele.getAttribute("value");
		   System.out.println(pass);
	}

	@Then("the user should navigate to the invalid page")
	public void the_user_should_navigate_to_the_invalid_page() {
	   System.out.println("user is in invalid page");
	}



	

}



