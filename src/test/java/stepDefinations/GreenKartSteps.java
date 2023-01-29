package stepDefinations;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GreenKartSteps {
	WebDriver	driver;
	
	@Given("^go to green kart home page$")
	public void go_to_green_kart_home_page() throws Throwable {
	    driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@Given("^user veryfy the page title$")
	public void user_veryfy_the_page_title() throws Throwable {
		String expected="GreenKart - veg and fruits kart";
		String actule=driver.getTitle();
		Assert.assertTrue("The text does not match expected",expected.contains(actule));
		System.out.println("Get Tital and Test Pass:: "+driver.getTitle());    
	    
	}

	@When("^user capture all items frome the page$")
	public void user_capture_all_items_frome_the_page() throws Throwable {
	    
	    
	}

	@When("^Print sortd prices in decending order$")
	public void print_sortd_prices_in_decending_order() throws Throwable {
	    
	    
	}

	@When("^add secend and third item into cart$")
	public void add_secend_and_third_item_into_cart() throws Throwable {
	    
	    
	}

	@Then("^user go to cart page$")
	public void user_go_to_cart_page() throws Throwable {
	    
	    
	}

	@Then("^user verify total price$")
	public void user_verify_total_price() throws Throwable {
	    
	    
	}

	@Then("^user veryfy successfully shiped items$")
	public void user_veryfy_successfully_shiped_items() throws Throwable {
	    
	    
	}


}
