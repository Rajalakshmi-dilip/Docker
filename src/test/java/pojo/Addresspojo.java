package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Addresspojo extends Baseclass{
	public Addresspojo() {

		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement name;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement mob;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement pin;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement addres;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement area;
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement land;
	@FindBy(xpath="(//input[@type='text'])[7]")
	private WebElement town;
	@FindBy(xpath="//span[text()='Choose a state']")
	private WebElement state;
	@FindBy(xpath="//a[text()='TAMIL NADU']")
	private WebElement tamilnadu;
	@FindBy(xpath="//span[text()=' Select an Address Type '] ")
	private WebElement type;
	@FindBy(xpath="//a[text()=' Office/Commercial (10 AM - 6 PM delivery) ']")
	private WebElement home;
	@FindBy(xpath="//span[text()='Use this address']")
	private WebElement use;
	
	public WebElement getName() {
		return name;
	}
	public WebElement getMob() {
		return mob;
	}
	public WebElement getPin() {
		return pin;
	}
	public WebElement getAddres() {
		return addres;
	}
	public WebElement getArea() {
		return area;
	}
	public WebElement getLand() {
		return land;
	}
	public WebElement getTown() {
		return town;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getTamilnadu() {
		return tamilnadu;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getHome() {
		return home;
	}
	public WebElement getUse() {
		return use;
	}

}
