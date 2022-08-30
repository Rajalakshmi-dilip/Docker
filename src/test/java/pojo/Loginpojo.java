package pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Baseclass;

public class Loginpojo extends Baseclass {
	public Loginpojo() {

		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']")
	private WebElement Hello;

	@FindBy(xpath="(//span[text()='Sign in'])[1]")
	private WebElement signin;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement username;

	@FindBy(xpath="//input[@id='continue']")
	private WebElement continu;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signin1;
	

	public WebElement getHello() {
		return Hello;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getContinu() {
		return continu;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getSignin1() {
		return signin1;
	}


}
