package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Productpojo extends Baseclass{
	public Productpojo() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='OnePlus']")
	private WebElement oneplus;
	
	@FindBy(xpath="(//span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)'])[1]")
			private WebElement selectphone;
	
	@FindBy(xpath="//input[@id='buy-now-button']")
	
	
	private WebElement Buynow;

	
	public WebElement getOneplus() {
		return oneplus;
	}

	public WebElement getSelectphone() {
		return selectphone;
	}

	public WebElement getBuynow() {
		return Buynow;
	}
}
