package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class GreenKartPF {
public GreenKartPF(WebDriver driver) {
		PageFactory.initElements(driver, this); }


@FindBy (how =How.XPATH,using="//*[@name='username']")
private static WebElement username;

public  void setUsername(WebElement username) {
	GreenKartPF.username = username;
}


}