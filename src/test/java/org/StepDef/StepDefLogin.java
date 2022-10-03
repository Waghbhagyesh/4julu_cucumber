package org.StepDef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefLogin {
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("manager");
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@And("user is on homepage")
	public void user_is_on_homepage() {
		System.out.println("on homepage");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String Title=driver.getTitle();
		String ExptTitle="actiTIME - Enter Time-Track";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		if(Title.equals(ExptTitle)) {
			System.out.println("Title Valid");
		}

	}

}
