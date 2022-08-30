package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Paymentpojo extends Baseclass{
	public Paymentpojo() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Add Debit/Credit/ATM Card']")
	private WebElement atm;
	@FindBy(xpath="//a[text()='Add a credit or debit card']")
	private WebElement adddebit;
	
	public WebElement getAtm() {
		return atm;
	}
	
	public WebElement getAdddebit() {
		return adddebit;
	}
}
