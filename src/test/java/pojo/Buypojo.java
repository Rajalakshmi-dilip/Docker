package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Buypojo extends Baseclass{
	
	public Buypojo() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="(//span[text()='₹59,999.00'])[4]")
	private WebElement price;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[17]")
	private WebElement colour;
	
	@FindBy(xpath="(//input[@class='a-button-input'])[24]")
	private WebElement size;
	
	
	@FindBy(xpath="//span[@id='submit.buy-now-announce']")
	private WebElement buynow;


	@FindBy(xpath="(//input[@class='a-button-input'])[17]")
	private WebElement scroll;

	

}
